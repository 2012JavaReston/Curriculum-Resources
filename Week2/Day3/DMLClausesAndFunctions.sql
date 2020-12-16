--Scalar functions, Agregate functions, group by, having, in , wildcards, between. 
-------------------------------------------------------------------------------------------------------------------
--Wildcards 
--% is a wildcard that is a stand-in for 0 or more charaacters 
select * from planets where planet_description like 'B%'; --Anything starting with a B
select * from planets where planet_description like 'B%%%%%%%%%%%%%%%'; --Anything starting with a B
select * from planets where planet_description like '%el%'; --Anything with e in it. 

--_ is a wildcard that is a stand-in for exactly 1 character
select planet_description ,planet_name as name from planets where planet_description like '%_i_%'; 
--This has to be any 3 character string, with i in the middle
select planet_description ,planet_name as name from planets where planet_description ilike 'b%';  --ilike is not case sensitivie

select planet_name as name from planets where planet_description = '%_Big'; --We can't use wildcards with '='. looking for "%_Big"

-------------------------------------------------------------------------------------------------------------------

-- in keyword 
select * from planets where planet_name = 'Jupiter' or planet_name = 'Earth' or planet_name = 'Mars';
select * from planets where planet_name in('Jupiter','Earth','Mars');

-------------------------------------------------------------------------------------------------------------------
--betwen 
select * from planets where planet_id between 70 and 74;
select * from planets where number_of_moons between 1 and 1000;

-------------------------------------------------------------------------------------------------------------------
--Groups 
select sum(number_of_moons) from planets group by rings;
select count(number_of_moons) as ringed_and_not_ringed from planets group by rings order by ringed_and_not_ringed desc;
select count(number_of_moons) from planets group by planet_name;


--find the number of planets with more than 1 moon grouped together by the ring status 
select count(*) from planets where number_of_moons > 0 group by rings hav;

--group together planets by their ring status, only consider groups with a sum of more than 20 planets
select count(*) as planets from planets group by rings having sum(number_of_moons) < 20;

--grouup together planets by their ring status, only consider groups with less than 4 planets;
select count(*) as planets from planets group by rings having count(*) > 0;
-------------------------------------------------------------------------------------------------------------------
--AGREGATE FUNCTIONS: They require a set of values to produce a value. 

select count(planet_name) from planets; --returns the number of records, where the record is not a null value 
select sum(planet_id) from planets;
select min(number_of_moons) from planets;
select max(number_of_moons) from planets;
select avg(number_of_moons) as average_of_moons from planets;

-------------------------------------------------------------------------------------------------------------------
--SCALAR FUNCTION
--Acts on each row, takes in a single value and returns a single value

select upper(planet_name) from planets;
select lower(planet_name) from planets;
select round(avg(number_of_moons)) as rounded_average from planets; --This rounds 
-------------------------------------------------------------------------------------------------------------------
--SQL functions

--i.e. how to get the current date and time? 

