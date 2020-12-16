select * from employee;
select * from employee where last_name = 'King';
select * from employee where (first_name = 'Andrew' and reports_to isnull);

select * from Album order by title desc;
select first_name from customer order by city asc;

insert into genre values(6151585, 'New_Genre');
insert into genre values(6151586, 'New_Genre');

insert into employee values (11, 'lname', 'fname', 'title', 1);
insert into employee values (12, 'lname', 'fname', 'title', 1);

insert into customer values (60, 'fname', 'lname');
insert into customer values (61, 'fname', 'lname');

update customer set first_name = 'Robert', last_name = 'Walter' where first_name = 'Aaron' and last_name = 'Mitchell';
update artist set name = 'CCR' where name = 'Creedence Clearwater Revival';

select * from invoice where billing_address like 'T%';

select * from invoice where total between 15 and 20;
select * from employee where hire_date between '2003-06-01' and '2004-03-01';

delete from invoice_line where invoice_id = 50;
delete from invoice_line where invoice_id = 61;
delete from invoice_line where invoice_id = 116;
delete from invoice_line where invoice_id = 245;
delete from invoice_line where invoice_id = 268;
delete from invoice_line where invoice_id = 290;
delete from invoice_line where invoice_id = 342;
delete from invoice where customer_id = 32;
delete from customer where first_name = 'Robert' and last_name = 'Walter';
