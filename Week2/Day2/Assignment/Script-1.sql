select * from employee;

select * from employee e where last_name='King';

select * from employee e where first_name='Andrew' and reports_to is null ;


select * from album order by title desc;

select first_name from customer c order by city ;


select * from genre order by genre_id ;

insert into genre (name) values ('K-Pop'), ('Vaporwave');
delete from genre where name = 'K-Pop' or name='Vaporwave';

select * from employee e;

insert into employee (last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email)
values ('Stroud', 'Shirley', 'Sales Support Agent', 2, '1965/06/15', '2006/09/30', '4419 Dansk Ridge Court', 'Fishers', 'IN', 'United States',
'46250', '+1 (925) 232-1794', '+1 (925) 317-6995','s.stroud@chinookcorp.com');

insert into employee (last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email)
values ('McCutcheon','Kenneth','Assistant Manager',1,'1994/09/24','2019/03/12','4202 Clement St','Atlanta','GA','United States',
'30303','+1 (404) 527-8117','+1 (404) 472-3819','kenmccutchen@swagdaddy.net');

select * from customer c2 order by customer_id ;

insert into customer (first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id) 
values ('Angel','LaChance', null, ' 1230 Somewhere St', 'Dayton', 'OH', 'United States', '45314', 
'+1(317)684-9873','+1 (317) 948-1382', 'lachance.angel@ohiostate.edu', 2);

insert into customer (first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id) 
values ('Benjamin','LaChance', null, ' 1230 Somewhere St', 'Dayton', 'OH', 'United States', '45314', 
'+1(317)814-1446','+1 (317) 948-1382', 'itsyaboiben@yahoo.com', 2);

select * from customer where first_name = 'Aaron';
update customer set first_name='Robert', last_name='Walter'
where customer_id = 32;

select * from artist a2 where name = 'CCR';
update artist set name='CCR' 
where name='Creedence Clearwater Revival';

select * from invoice i2 where billing_address like 'T%';

select * from invoice i2 where total between 15 and 50;

select * from employee e2 where hire_date between '2003/6/1' and '2004/3/1';

select * from customer c2 ;
select * from invoice i ;
alter table invoice drop constraint fk_invoice_customer_id;
delete from customer where first_name='Robert' and last_name='Walter';

update invoice set customer_id = customer_id-1 where customer_id > 32;
update customer set customer_id = customer_id -1 where customer_id >32;

--tried to also remove Robert's Invoices but they are FK'ed to invoice_line...
delete from invoice where billing_city = 'Winnipeg' and billing_address like '696%';

select * from invoice_line il ;  --what is all this? 
select * from customer c order by customer_id ;
select * from invoice i order by customer_id ;

