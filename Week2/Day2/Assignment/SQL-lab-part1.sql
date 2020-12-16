--2.1--
select * from employee;
select * from employee where last_name = 'King';
select * from employee where first_name = 'Andrew' and reports_to isnull;

--2.2--
select * from album order by title desc;
select first_name from customer order by city;

--2.3--
insert into genre(name) values
	('new genre 1'),
	('new genre 2');

insert into employee(last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email) values 
	('Scott', 'Michael', 'Regional Manager', null, '1-1-2020', '1-2-2020', '5150 Cloverfield Ln', 'Scranton', 'PA', 'United States', '12345', '+1 (800) 867-5309', '+1 (800) 867-5309', 'michaelscott@dmifflin.com'),
	('Schrute', 'Dwight', 'Ass. to the Regional Manager', 10, '12-15-2020', '12-15-2021', '1234 Dodge Ave', 'Scranton', 'PA', 'United States', '82828', '+1 (234) 567-8910', '+1 (800) 867-5309', 'dwightschrute@dmifflin.com');
	
insert into customer(first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id) values
	('Some', 'Body', 'Revature', '6387 Bordfish Rd', 'Detroit', 'MI', 'United States', '48180', '+1 (222) 222-2222', '+1 (222) 222-2222', 'some.body@revature.net', '10'),
	('Jimothy', 'James II', 'A real company', '1234 Bordfish Rd', 'Detroit', 'MI', 'United States', '48180', '+1 (322) 222-2222', '+1 (322) 222-2222', 'jimothy@hotmail.com', '11');

--2.4--
update customer set (first_name, last_name) = ('Robert', 'Walter') where first_name = 'Aaron' and last_name = 'Mitchell';
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

--2.5--
select * from invoice where billing_address like 'T%';

--2.6--
select * from invoice where total between 15 and 50;
select * from employee where hire_date between '01-06-2003' and '01-03-2004';

--2.7--
alter table invoice 
	drop constraint fk_invoice_customer_id,
	add constraint fk_invoice_customer_id foreign key (customer_id) references customer(customer_id) on delete cascade;

alter table invoice_line
	drop constraint fk_invoice_line_invoice_id,
	add constraint fk_invoice_line_invoice_id foreign key (invoice_id) references invoice(invoice_id) on delete cascade;

delete from customer where first_name='Robert' and last_name = 'Walter';