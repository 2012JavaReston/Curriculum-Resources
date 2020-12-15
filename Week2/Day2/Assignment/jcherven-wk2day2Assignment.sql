-- 2.1
	-- select all records from the Employee table.
	select * from Employee;
	-- select all records from the Employee table where the last name is King.
	select * from Employee where last_name = 'King';
	-- select all records from the Employee table where the first name is Nadrew and REPORTSTO is null.
	select * from Employee where first_name = 'Andrew' and reports_to is null;
-- 2.2
	-- select all albums in Album table and sort result set in descending border by title
	select * from Album order by title desc;
	-- select first name from customer and sort result set in ascending order by city
	select first_name from customer order by city asc;
-- 2.3
	-- Insert two new records into Genre table
  insert into genre (genre_id, name) values 
    (26, 'Fusion'),
    (27, 'Anisong');
	-- insert two new records into Employee table
  insert into employee (last_name, first_name) values
    ('Inugami', 'Korone'),
    ('Usada', 'Pekora');
	-- Insert two new records into Customer table
  insert into customer (first_name, last_name, email) values
    ('Okayu', 'Nekomata', 'okayu@onigirishop.net'),
    ('Marine', 'Houshou', 'marine@pirateship.com');
-- 2.4
	-- update aaron mitchell in customer table to Robert Walter
  update customer
    set first_name='Robert', last_name='Walker'
    where first_name='Aaron' and last_name='Mitchell';
	-- update the name of artist in the Artist table "Creedence Clearwater Revival" to "CCR"
  update artist
    set name='CCR'
    where name='Creedence Clearwater Revival';
-- 2.5
	-- select all invoices with a bililng address like "T%"
  select * from invoice where billing_address like 'T%';

-- 2.6
	-- select all invoices that have a total between 15 and 50
  select * from invoice where total between 15 and 50;
	-- select all employees hired between 1st of June 2003 and 1st of March 2004
  select * from employee where hire_date between date('2003-06-01') and date('2004-03-01');
-- 2.7
	-- delete a record in Customer table where the name is Robert Walter (resolve constraints)

