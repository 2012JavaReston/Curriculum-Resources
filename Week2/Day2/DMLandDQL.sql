--DML and DQL 
--This sublanguage covers the commands for manipulation our records inside our table. 
--Insert, Select, Update, Delete 
-- CRUD - Create, Read, Update, Delete 

--Insert values into our tables 
insert into planets values(13, 'Mercry2',null,true,0);

--If you don't want to put in all the value, then you specify the columns

insert 
	into 
		planets (planet_name, planet_description, rings) --I'm not putting in any value for id
		values ('Venus', 'Getting a tad warm',false);
		
	
	
	--Alternatively we can input multiple value like this:
	
insert into planets (planet_name, planet_description, rings, number_of_moons) values
	('Mercury', 'Never too close', true, 0),
	('Venus', 'Getting a tad warm', false, 0),
	('Earth', 'cradle of civilization', false, 1),
	('Mars', 'Earth 2.0', false, 2),
	('Jupiter', 'Big', true, 67),
	('Saturn', 'very ringy', true, 82),
	('Uranus', 'blue', true, 27),
	('Neptune', 'getting nippy', true, 14),
	('Pluto', 'you cannot get rid of me', false, 2)
	
------------------------------------------------------------------------------------------
	
--READING VALUES FROM THE TABLE (DQL and DML) 
	
select * from planets;

--select a specific column 
select planet_name, planet_description from planets;

-- adding a 'WHERE' CLAUSE helps us to narrow down our search, it acts as a filter
select planet_name from planets where planet_name = 'Mercury';
select * from planets where planet_name = 'Mercury';

select planet_name from planets where rings = true;

--AND and OR clause
select planet_name from planets where rings = true and number_of_moons > 20;
select planet_name from planets where rings = true or number_of_moons < 20;

--ORDER BY , by default ascending (asc) but also can have descending (desc)
select * from planets order by planet_name desc;

--select with an aliase, aliases don't affect the table structure, they just modify the result view
select planet_name from planets as p where p.planet_id = 8;

--also applicable to column names
select planet_name as name from planets;

-------------------------------------------------------------------------------------------------------
--UPDATING table values 
update planets set planet_Description = 'very big' where planet_name = 'Jupiter';
update planets set number_of_moons = 100;

-------------------------------------------------------------------------------------------------------
-- DELETING FROM TABLES

delete from planets where planet_id = 9; 

delete from planets; -- deletes all the records from the table
