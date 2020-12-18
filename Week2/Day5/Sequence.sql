--Indexes 
-- Aloow for more efficient quering of database records 
--By indexing a column, we allow faster retrieval of information based on the column 

--By default, unique constraints and primary key columns are indexed 

select * from planets;

create index p_description_index on planets (planet_description);

--It creates more memory overhead. 

--Sequences

--Creating a sequence and attatching it to a table 

--syntax:

create sequence "example_seq"
	increment 1 -- optional, set's out increment value, default = 1
	minvalue 1 -- set's the minimum value of the sequence (NO MINVALUE)
	maxvalue 5 -- set our mav value to 6 (no macimum) 
	start 3 -- (optional) allows us to specify where to start
	cache 1; --(optional) preloads the numbers into memory
select setval('"public"."example_seq"',2);

drop sequence example_seq;

create table example_table(
	table_id int primary key default nextval('example_seq'::regclass) not null, 
	row_name varchar(120)
);

select * from example_table ;

insert into example_table (row_name) values 
	('a'),
	('a'),
	('a')
	
insert into example_table (row_name) values ('b');
	
