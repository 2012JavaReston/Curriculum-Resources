--2.1
select * from employee;

select * from employee 
where last_name='King';

select * from employee
where first_name='Andrew' and reports_to is null;

--2.2

select * from album
order by title desc;

select first_name
from customer
order by city asc;

--2.3
insert into genre (genre_id, name) values 
	(26, 'Indie'),
	(27, 'Unknown');

INSERT INTO public.employee (last_name,first_name,title,reports_to,birth_date,hire_date,address,city,state,country,postal_code,phone,fax,email) VALUES
	 ('Settin','Marc','CEO',NULL,'1995-11-02 00:00:00.000','2020-11-14 00:00:00.000','111 Muffin Ave NW','Charlotte','NC','USA','28277','+1 (555) 555-5555','+1 (555) 555-5555','marcsettin@chinookcorp.com'),
	 ('Doe','John','Sales',1,'1955-11-08 00:00:00.000','2002-08-08 00:00:00.000','125 9 Ave NW','Cornell','AB','Canada','T2P 2T3','+1 (403) 555-3443','+1 (403) 555-3322','jdoe@chinookcorp.com');
	 
INSERT INTO public.customer (first_name,last_name,company,address,city,state,country,postal_code,phone,fax,email,support_rep_id) VALUES
	 ('Jello','McGoo','Jello Boys','1234 J Street','JTown','JS','JSA','12345-000','+1 (123) 3233-5535','+1 (123) 3323-3366','jboi@jello.com',3),
	 ('Big','Dawg','Them Boys','321 Boys Road','Dog City',NULL,'JSA','12356','123 458 9658',NULL,'maddawg@bigcity',5);
	 
--2.4
update customer 
set first_name='Robert', last_name='Walter'
where customer_id = 32;

update artist 
set name = 'CCR'
where name = 'Creedence Clearwater Revival';

--2.5
select *
from invoice
where billing_address like 'T%';

--2.6
select *
from invoice
where total between 15 and 50;

select *
from employee
where hire_date between '2003/06/01' and '2004/03/01';

--2.7
alter table invoice 
drop constraint fk_invoice_customer_id;

delete from customer 
where first_name = 'Robert' and last_name = 'Walter';

