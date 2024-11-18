create database product_db;
 -- Product Database --
use product_db;
-- *********PRODUCT TABLE  ***********
CREATE TABLE product (
    prod_id INT PRIMARY KEY AUTO_INCREMENT,
    prod_name VARCHAR(30) NOT NULL UNIQUE,
    prod_type ENUM('Sophisticated', 'Elite', 'Luxury') NOT NULL,
    prod_wax ENUM('Soy_Wax', 'Bees_Wax', 'Coconut_Wax') NOT NULL,
    prod_major_scent VARCHAR(20) NOT NULL,
    prod_minor_scent VARCHAR(20) NOT NULL
);

CREATE TABLE product_cost_relation (
    cost_relation_id INT PRIMARY KEY AUTO_INCREMENT,
    prod_id INT NOT NULL, -- fk
    prod_cost_price INT NOT NULL,
    prod_mrp INT NOT NULL,
    discount_quarter int NOT NULL,
    prod_discount INT NOT NULL,
    prod_selling_price INT NOT NULL
);

CREATE TABLE product_revenue (
    revenue_id INT AUTO_INCREMENT PRIMARY KEY,
    prod_id INT NOT NULL, -- fk
    discount_quarter int NOT NULL,
    quantity INT NOT NULL DEFAULT 0,
    profit INT NOT NULL DEFAULT 0,
    revenue INT NOT NULL DEFAULT 0
);

-- **********  TRANSACTION **********
CREATE TABLE transaction_table (
    transaction_id int PRIMARY KEY auto_increment,
    payment_time varchar(15) ,
    payment_date varchar(15),
    customer_id int not null, -- fk 
    order_id INT UNIQUE, 
    total_amount INT NOT NULL,
    offer_code VARCHAR(20) DEFAULT NULL,
    offer_discount INT DEFAULT 0,
    bank_code VARCHAR(20) DEFAULT NULL,
    bank_discount INT DEFAULT 0,
    points_applied INT DEFAULT 0,
    CHECK (points_applied <= (total_amount - offer_discount - bank_discount) * 0.10),
    total_discount INT NOT NULL,
    amount_paid INT NOT NULL
);

-- -- *********TRANSACTION DETAILED***********

CREATE TABLE transaction_detailed (
	td_id int primary key auto_increment, 
    purchase_date varchar(15),
    order_id INT NOT NULL UNIQUE, 
    customer_id INT NOT NULL, -- fk
    order_complete boolean not null default false
);

-- **********ITEMS BOUGHT************
create table items_bought(
	items_bought_id int not null auto_increment unique,
	order_id int not null,
    prod_id int not null, -- fk
    primary key(order_id, prod_id),
    quantity int not null,
    total_product_amount int not null,
    total_product_discount int not null,
    total_product_profit int not null
);

-- *********CUSTOMER TABLE***********
CREATE TABLE customer_table (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_email VARCHAR(30) UNIQUE,
    CHECK (customer_email LIKE '%@%._%'),
    customer_contact_num VARCHAR(10) NOT NULL UNIQUE,  /* without country code*/
    customer_fullname VARCHAR(50) NOT NULL,
    customer_points INT NOT NULL DEFAULT 0,
    customer_address VARCHAR(255) NOT NULL
);


-- ******** MAPPINGS **********

alter table product_cost_relation 
add constraint fk_prod_id
foreign key (prod_id) references product(prod_id);

alter table product_revenue 
add constraint fk_prod_id1
foreign key (prod_id) references product(prod_id);

alter table transaction_detailed 
add constraint fk_customer_id
foreign key (customer_id) references customer_table(customer_id);

alter table transaction_table
add constraint fk_transaction_table_to_customer_table 
foreign key (customer_id) references customer_table(customer_id);

alter table items_bought
add constraint fk_items_bought_to_customer_table 
foreign key (product_id) references product(prod_id); 


drop database product_db ;