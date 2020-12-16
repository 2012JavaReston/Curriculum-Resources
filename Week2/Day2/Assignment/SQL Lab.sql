--2.1 SELECT
select * from employee;

select * from employee where last_name = 'King';

select * from employee where first_name = 'Andrew' and reports_to = null;

--2.2 ORDER BY
select * from album order by title desc;

select first_name from customer order by city asc;

--2.3 INSERT INTO
insert into genre(name) values('Folk'), ('Disco');

insert into employee(last_name, first_name) values('Smith', 'John'), ('Baker', 'Bob');

insert into customer(first_name, last_name, email) values('John', 'Smith', 'jsmith@gmail.com'), ('Bob', 'Baker', 'bbaker@gmail.com');

--2.4 UPDATE
update customer set first_name = 'Robert', last_name = 'Walter' where first_name = 'Aaron' and last_name = 'Mitchell';

update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

--2.5 LIKE
select * from invoice where billing_address like 'T%';

--2.6 BETWEEN
select * from invoice where total between 15 and 50;

select * from employee where hire_date between '2003-06-01' and '2004-03-01';

--2.7
alter table invoice drop constraint fk_invoice_customer_id;
alter table invoice add constraint fk_invoice_customer_id foreign key (customer_id) references customer(customer_id) on delete cascade;
alter table invoice_line drop constraint fk_invoice_line_invoice_id;
alter table invoice_line add constraint fk_invoice_line_invoice_id foreign key (invoice_id) references invoice(invoice_id) on delete cascade;
delete from customer where first_name = 'Robert' and last_name = 'Walter';