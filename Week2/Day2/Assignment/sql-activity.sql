-- SELECT
SELECT * FROM Employee;
SELECT * FROM Employee where last_name = 'King';
select * from Employee where first_name = 'Andrew' and reports_to IS NULL;

-- ORDER BY
SELECT * FROM album ORDER BY title desc;
SELECT first_name FROM customer ORDER BY city asc;

-- INSERT INTO
INSERT INTO genre (genre_id, name) VALUES (26, 'George Blues');
INSERT INTO genre (genre_id, name) VALUES (27, 'George Rap');
INSERT INTO employee (employee_id, last_name, first_name, title, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) VALUES (9, 'George', 'Yoo', 'Janitor', '1989/4/22', '2020/7/12', '123 Fake Street', 'Oakland', 'CA', 'United States', '94105', '+1 (555) 123-4567', '+1 (555) 555-1234', 'g@g.com');
INSERT INTO employee (employee_id, last_name, first_name, title, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) VALUES (10, 'Margy', 'Lopez', 'Detective', '1994/7/10', '2020/7/14', '123 Fake Street', 'San Francisco', 'CA', 'United States', '94121', '+1 (555) 765-4321', '+1 (555) 123-4321', 'm@m.com');
insert into customer values 
	(60, 'George', 'Yoo', 'Revature', '123 Fake Street', 'San Francisco', 'CA', 'USA', 94121, '+55 (555) 555-5555', null, 'fake@fake.com'),
	(61, 'Tom', 'Arnold', 'Bobs Burger', '321 Fake Street', 'San Francisco', 'CA', 'USA', 94121, '+54 (555) 555-5555', null, 'm@m.com');

-- UPDATE
update customer set first_name = 'Robert' where first_name = 'Aaron';
update customer set last_name = 'Walter' where last_name = 'Mitchell';
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

-- LIKE
select * from invoice where billing_address like 'T%';

-- BETWEEN
select * from invoice where total between 15 and 50;
select * from employee where hire_date between '2003/6/1' and '2004/3/1';

-- DELETE
ALTER table invoice drop constraint fk_invoice_customer_id;
delete from customer where last_name = 'Walter';
