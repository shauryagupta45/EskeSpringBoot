-- ****************************************PRODUCT INSERTION**********************************************

delimiter //
create procedure insert_product(
	in product_name_in varchar(30), 
    in product_type_in enum('Sophisticated', 'Elite', 'Luxury'), 
    in product_wax_in enum('Soy Wax', 'Bees Wax', 'Coconut Wax'),
    in product_major_scent_in varchar(20),
    in product_minor_scent_in varchar(20)
    )
begin 
	insert into product (prod_name, prod_type, prod_wax, prod_major_scent, prod_minor_scent) 
	values (product_name_in, product_type_in, product_wax_in, product_major_scent_in, product_minor_scent_in);
end//
delimiter ;

-- call insert_product('flaoting candle', 'Elite', 'Soy Wax', 'lavender', 'jasmine');


-- *****************************PRODUCT COST RELATION INSERTION*************************************
create procedure insert_product_cost_relation(
	in product_id_in int, 
    in product_cost_price_in int, 
    in product_mrp_in int, 
    in product_discount_in int
)
	insert into product_cost_relation 
    (prod_id, prod_cost_price, prod_mrp, discount_quarter, prod_discount, prod_selling_price)
    values 
    (product_id_in, product_cost_price_in, product_mrp_in, concat(year(curdate()), quarter(curdate())), product_discount_in, product_mrp_in - product_discount_in);



-- **************************************PRODUCT REVENUE RECORD TRIGGER**************************************

create trigger product_revenue_record 
after insert 
on product 
for each row 
	insert into product_revenue(prod_id, discount_quarter) values(new.prod_id, year(curdate())*10 + quarter(curdate()) );
    
    
-- *******************************CUSTOMER REGISTERATION PRODECURE*************************************** 

create procedure register_customer(
	in customer_email_in varchar(30),
    in customer_contact_num_in varchar(10), /* without country code*/
    in customer_fullname_in varchar(50), 
    in customer_address_in varchar(255)
)
	insert into customer_table 
    (customer_email, customer_contact_num, customer_fullname, customer_address) 
	values 
    (customer_email_in, customer_contact_num_in, customer_fullname_in, customer_address_in);


-- *************************trnasaction_complete******************************

create trigger transaction_complete
after insert
on transaction_table
for each row
	update transaction_detailed set order_complete = true where order_id = new.order_id;
    
    
    
  -- *****************************ITEMS BOUGHT INSERT*********************************8  

DELIMITER //

CREATE PROCEDURE items_bought_insert(
    IN order_id_in INT,
    IN product_id_in INT,
    IN quantity_in INT
)
BEGIN
    DECLARE prod_amount_in INT;
    DECLARE product_discount_in INT;
    DECLARE total_product_amount INT;
    DECLARE total_product_discount INT;

    -- Get product MRP and discount into variables
    SELECT prod_mrp INTO prod_amount_in 
    FROM product_cost_relation 
    WHERE prod_id = product_id_in;
    
    SELECT prod_discount INTO product_discount_in 
    FROM product_cost_relation 
    WHERE prod_id = product_id_in;
    
    -- Calculate total amounts based on quantity
    SET total_product_amount = prod_amount_in * quantity_in;
    SET total_product_discount = product_discount_in * quantity_in;

    -- Insert into items_bought table
    INSERT INTO items_bought (order_id, product_id, quantity, total_product_amount, total_product_discount, total_product_profit) 
    VALUES (order_id_in, product_id_in, quantity_in, total_product_amount, total_product_discount, total_product_amount-total_product_discount );
    
END //

DELIMITER ;

-- *******************************LAST ORDER ID FUNCTION *************************************
delimiter //
CREATE FUNCTION last_order_id() 
RETURNS INT
deterministic
BEGIN
    DECLARE last_id INT;

    SELECT order_id INTO last_id
    FROM transaction_detailed
    ORDER BY order_id DESC
    LIMIT 1;

    RETURN last_id; 
end //
delimiter ;

-- ************************* transaction_detailed_insert ********************************
DELIMITER //

CREATE PROCEDURE transaction_detailed_insert(
    IN order_id_in INT,
    IN customer_id_in INT
)
BEGIN
    INSERT INTO transaction_detailed (order_id, customer_id)
    VALUES (order_id_in, customer_id_in);
END //

DELIMITER ;

-- ******************************CUSTOMER POINTS*****************************************

DELIMITER //

CREATE FUNCTION check_customer_points(cust_id INT) 
RETURNS INT
deterministic
BEGIN
    DECLARE custPoints INT;

    SELECT customer_points INTO custPoints
    FROM customer_table 
    WHERE customer_id = cust_id;

    RETURN custPoints;
END //

DELIMITER ;

-- ********************************TRANSACTION TABLE INSERT*************************************
DELIMITER //

create procedure transaction_table_insert(
	in customer_id_in int,
    in order_id_in int, 
    in offer_code_in varchar(20),
    in bank_code_in varchar(20)
)
begin 
	declare total_amount_in int;
    declare offer_discount_in int;
    declare bank_discount_in int;
    declare total_discount_in int;
    declare amount_paid_in int;
    declare points_applied_in int;
    
	select sum(total_product_amount) into total_amount_in from items_bought where order_id = order_id_in;
	select offer_discount_max into offer_discount_in from offer where offer_code = offer_code_in;
	select offer_discount_max into bank_discount_in from offer where offer_code = bank_code_in;
    
    if(check_customer_points(customer_id_in) <= points_applied) then
		set points_applied_in = check_customer_points(customer_id_in);
        
    end if;

	select sum(total_product_discount) + bank_discount_in + offer_discount_in into total_discount_in from items_bought where order_id = order_id_in;

	set amount_paid_in = total_amount_in - total_discount_in;
    
    set points_applied_in = amount_paid_in * 0.10;	
    
    insert into transaction_table (customer_id, order_id, total_amount, offer_code, offer_discount, bank_code, bank_discount, points_applied, total_discount, amount_paid)
    values (customer_id_in, order_id_in, total_amount_in, offer_code_in, offer_discount_in, bank_code_in, bank_discount_in, points_applied_in, total_discount_in, amount_paid_in);
end //

DELIMITER ;

-- ********************************REVENUE RECORD UPDATE (ITEM WISE)************************************

DELIMITER //

CREATE PROCEDURE update_product_revenue_details(IN given_order_id INT)
BEGIN
    DECLARE finished INT DEFAULT 0;
    DECLARE current_product_id INT;

    -- Declare variables for storing item details
    DECLARE update_quantity INT;
    DECLARE update_profit INT;
    DECLARE update_revenue INT;

    -- Declare a cursor to get all prod_id values with the given order_id
    DECLARE product_cursor CURSOR FOR
        SELECT prod_id FROM items_bought WHERE order_id = given_order_id;

    -- Declare a continue handler to handle the end of the cursor
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = 1;

    -- Open the cursor
    OPEN product_cursor;

    -- Loop to go through each product_id for the given order_id
    read_loop: WHILE finished = 0 DO
        -- Fetch the next product_id into the variable
        FETCH product_cursor INTO current_product_id;

        -- Exit loop if no more rows are found
        IF finished = 1 THEN
            LEAVE read_loop;
        END IF;

        -- Fetch product details for the current product_id
        SELECT quantity, total_product_amount, total_product_profit
        INTO update_quantity, update_revenue, update_profit
        FROM items_bought
        WHERE order_id = given_order_id AND prod_id = current_product_id;

        -- Update the product_revenue table with fetched values
        UPDATE product_revenue
        SET quantity = update_quantity,
            profit = update_profit,
            revenue = update_revenue
        WHERE prod_id = current_product_id;

    END WHILE;

    -- Close the cursor
    CLOSE product_cursor;
END //

DELIMITER ;





-- ********************************update order confirmation*****************************************
DELIMITER //

CREATE TRIGGER after_order_complete_update
AFTER UPDATE ON transaction_detailed
FOR EACH ROW
BEGIN
    DECLARE current_order_id INT;

    -- Check if the order_complete status has changed from false to true
    IF OLD.order_complete = FALSE AND NEW.order_complete = TRUE THEN
        -- Fetch the order_id for the updated row
        SET current_order_id = NEW.order_id;
		call update_product_revenue_details (current_order_id);
	
        -- Here you can add any additional logic you need using `current_order_id`
        -- For example, you might want to log this event, update another table, etc.
    END IF;
END //
DELIMITER ;


-- *****************************CUSTOMER POINTS UPDATE **********************************
DELIMITER //

CREATE TRIGGER update_points
AFTER INSERT 
ON transaction_table
FOR EACH ROW 
BEGIN
    DECLARE new_points INT;
    DECLARE cust_id INT;
    
    SET cust_id = NEW.customer_id;
    SET new_points = NEW.amount_paid * 0.10;
    
    UPDATE customer_table 
    SET customer_points = customer_points + new_points 
    WHERE customer_id = cust_id;
END //

DELIMITER ;

