use product_db;

-- employee 
CREATE TABLE employee (
    emp_id INT PRIMARY KEY AUTO_INCREMENT,
    emp_name VARCHAR(50) NOT NULL,
    start_date VARCHAR(10) NOT NULL,
    emp_status VARCHAR(20) NOT NULL CHECK (emp_status IN ('Active' , 'Inactive')),
    emp_contact VARCHAR(10) NOT NULL,
    emp_role VARCHAR(50) NOT NULL,
    can_approve BOOLEAN DEFAULT FALSE,
    dept_id INT NOT NULL,  -- fk 
    team_id INT NOT NULL -- fk 
); 

-- department 
CREATE TABLE department (
    dept_id INT PRIMARY KEY AUTO_INCREMENT,
    dept_name VARCHAR(100) NOT NULL,
    dept_head INT NOT NULL
);-- dept_id should be equal to emp_id, even tho it is not fk mapped

CREATE TABLE team (
    team_id INT PRIMARY KEY AUTO_INCREMENT,
    team_status VARCHAR(20) NOT NULL CHECK (team_status IN ('ACTIVE' , 'INACTIVE')),
    dept_id INT NOT NULL, -- fk 
    teamlead_id INT default null 
);
 -- teamlead id should be there(fk)
CREATE TABLE logistics (
    log_shipid INT PRIMARY KEY AUTO_INCREMENT,
    log_shipquantity INT NOT NULL,
    log_shipstatus enum('DONE' , 'NOT_DONE') not null,
    log_shipfrom VARCHAR(100) NOT NULL,
    log_shipto VARCHAR(100) NOT NULL,
    log_shipcost INT NOT NULL,
    log_product_id INT NOT NULL -- fk 
); 
-- product id is fk 


CREATE TABLE customer_support (
    cust_ticketid INT PRIMARY KEY,
    cust_ticket_status enum ('OPEN' , 'CLOSED') not null,
    cust_ticket_desc VARCHAR(200) DEFAULT NULL,
    cust_ticket_logdate varchar(15) NOT NULL,
    cust_ticket_closedate varchar(15) NOT NULL,
    cust_employee_id INT NOT NULL, -- fk 
    cust_customer_id INT NOT NULL, -- fk 
    cust_order_id INT NOT NULL 
);
 -- employee id(fk)
CREATE TABLE delivery (
    delivery_id INT PRIMARY KEY AUTO_INCREMENT,
    delivery_address VARCHAR(200) NOT NULL,
    delivery_contact VARCHAR(10) NOT NULL,
    delivery_expected_date varchar(15) NOT NULL,
    delivery_start_date varchar(15) NOT NULL,
    actual_delivery_date varchar(15) NOT NULL,
    delivery_status enum('DONE' , 'NOT DONE') not null,
    delivery_order_id INT NOT NULL, 
    delivery_customer_id INT NOT NULL -- fk 
); 

CREATE TABLE campaign (
    campaign_id INT PRIMARY KEY AUTO_INCREMENT,
    campaign_budget DECIMAL(15 , 2 ) NOT NULL,
    campaign_approval BOOLEAN NOT NULL,
    campaign_platform VARCHAR(50) NOT NULL,
    campaign_start_date varchar(15) NOT NULL,
    campaign_end_date varchar(15) NOT NULL,
    campaign_hired_agency VARCHAR(200) NOT NULL
);

-- offers 
CREATE TABLE offer (
    offer_id INT PRIMARY KEY AUTO_INCREMENT,
    offer_code VARCHAR(20) DEFAULT NULL,
    offer_discount_max INT DEFAULT 0,
    offer_percentage int DEFAULT 0
);

CREATE TABLE push_notification (
    notification_id INT PRIMARY KEY AUTO_INCREMENT,
    notification_approval BOOLEAN DEFAULT FALSE,
    notification_message VARCHAR(200) NOT NULL,
    notication_reached BOOLEAN
);




--  ** foreign keys ** 
alter table employee 
add foreign key (dept_id) references department(dept_id),
add foreign key (team_id) references team(team_id);   


alter table team 
add foreign key (dept_id) references department(dept_id);

ALTER TABLE logistics 
ADD FOREIGN KEY (log_product_id) REFERENCES product(prod_id);
 
 alter table customer_support
 add foreign key (cust_employee_id) references employee(emp_id),
 add foreign key (cust_customer_id) references customer_table(customer_id);

alter table delivery 
add foreign key (delivery_customer_id) references customer_table(customer_id);
