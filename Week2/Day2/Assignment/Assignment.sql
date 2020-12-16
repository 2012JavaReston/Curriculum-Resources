--2.1 SELECT

select * from employee; 
select * from employee where last_name = 'King'; 
select * from employee where first_name = 'Andrew' and reports_to is null; 


--2.2 ORDER BY
select * from Album order by title desc;
select first_name from customer order by city; 

--2.3 INSERT INTO
insert into genre values 
(26, 'Pop-Rap'), 
(27, 'Folk'); 

insert into employee values
(9, 'Young', 'Lester', 'Software Engineer', 6, '1989-07-07 00:00:01', CURRENT_TIMESTAMP, '14160 Serena Lake Dr', 'Orlando', 'FL', 'USA', '32837', '+1(407)5209700', null, 'lester.young@revature.net' ); 
insert into employee values
(10, 'Zuckerberg', 'Mark', 'Senior Software Engineer', 6, '1984-05-14 00:00:0', CURRENT_TIMESTAMP, '123 Somewhere Street', 'Los Angeles', 'CA', 'USA', '55555', '+1(555)5555555', null, 'mark.zucker@fb.com' ); 

insert into customer(last_name, first_name, email) values ('Truong', 'Larry', 'Larry@Truong.com');
insert into customer(last_name, first_name, email) values ('Rodriguez', 'Joseph', 'Joe@Rodriguez.com');


--2.4 UPDATE
update customer set first_name = 'Robert', last_name = 'Walter' where first_name = 'Aaron'; 
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival'; 

--2.5 LIKE
select * from invoice where billing_address like 'T%'

--2.6 BETWEEN
select * from invoice where total between 15 and 50; 
select * from employee where hire_date between '2003-06-01 00:00:00' and '2004-03-01 00:00:00'; 

--2.7 DELETE
select * from customer where first_name = 'Robert'; 


alter table invoice 
	drop constraint fk_invoice_customer_id; 


delete from customer where first_name = 'Robert' and last_name = 'Walter'; 	

select * from invoice where customer_id = 32; 

delete from invoice where customer_id = 32; --I believe this was Robert Walter's customer id before i deleted it.

ALTER TABLE invoice ADD CONSTRAINT fk_invoice_customer_id
    FOREIGN KEY (customer_id) REFERENCES customer (customer_id) ON DELETE NO ACTION ON UPDATE NO ACTION;

	
	
	

