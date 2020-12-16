--Procedures 
--Procedure is a process, that takes in argumetns but will not return anything
--Method is a function that relates to a class
--Fucntion is a block of code that is executed, that takes in and returns argulments 

--PlSQL
--Programming SQL

create or replace procedure insert_into_planets(p_name varchar(30), p_desc varchar(60), r boolean)
language sql 
as $$
	--Here's the procedure specific logic 
	insert into planets (planet_name,planet_description,rings) values (p_name,p_desc,r);
	insert into special (special_name,status,orders) values (p_name,'customer',0);
	select * from planets; -- won't actually return a view when exectuted. 
$$;

call insert_into_planets('boby2','its a big human', true);

select * from special;
select * from planets;