--DDL
--DDL has commands that will affect the structure of a table. 
-- Create, ALter, Drop, Truncate 


create table basic(
	--this table no columns, so we can't actually info here 
);

drop table basic; --remove the data and the table strcture 

create table if not exists upgraded( --when creating a table
	user_id int, --we only have to define column name and datatype 
	user_name varchar(30)
);

drop table upgraded;

insert into upgraded values(null,null);

--int 
--varchar 
--float8
--timestamp
--char
--boolean
--https://www.postgresql.org/docs/9.5/datatype.html

create table if not exists planets(
-- column name| column type |constraints
-- Primary key == not null and unique 
-- Primary keys are used to reference a row/record within our table
	planet_id serial primary key,
	planet_name varchar(30) not null unique,
	planet_description varchar(60) not null,
	has_rings boolean not null,
	number_of_moons smallint check(number_of_moons > -1)

);

--removes all the data, but not the table structure!
truncate table planets; 

alter table if exists planets rename has_rings to rings;

--remove data and the table structure!
drop table planets; 
