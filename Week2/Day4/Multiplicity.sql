-- Table Relationships 
-- Multiplicity
-- one to one
-- one to many 
-- many to one
-- many to many

drop table if exists planets cascade;
drop table if exists moons cascade;

--Tangent
--Transactions : ACID, Atomicity, Consistency

drop table planets;
--Our moon table has a reference to our planets table
--If we remove the planets table or remove data inside, we will have orphan records (when referential integrity is violated)
--It will point to something that does not exist!

insert table stars(
	star_id serial primary key, 
	star_name varchar(30);
)
create table planets (
	planet_id serial primary key, 
	planet_name varchar(30),
	planet_description varchar(40)
--	my_star int references stars(star_id)
);

create table moons (
	moon_id serial primary key,
	moon_name varchar(30),
	my_planet int references planets(planet_id)
	);

select * from planets;
	
insert into planets(planet_name,planet_description) values ('Earth', 'blue and green');

insert into planets(planet_name,planet_description) values ('Earth 2.0', 'brown and green');

insert into planets(planet_name,planet_description) values ('Mars', 'Reddy');
insert into planets(planet_name,planet_description) values ('Mars', 'Reddy2');

insert into moons(moon_name, my_planet) values ('The Moon', 
	(select planet_id from planets where planet_name = 'Earth'));

insert into moons(moon_name, my_planet) values 
	('Deimos' , (select planet_id from planets where planet_name = 'Mars')),
	('The other one', (select planet_id from planets where planet_name = 'Mars'));


select * from moons;
--CRUD 
--Update
update moons set my_planet = (select planet_id from planets where planet_name  = 'Earth 2.0') 
			where moon_name = 'The Moon';

delete from planets where planet_name = 'Earth';
delete from planets where planet_description = 'Reddy2';

--------------------------------------------------------------------------------------------------
--Many to one
--Is the same but flipped 


--One to One 
--Standard sql does not offere one-to-one relationships easily.
--Instead we're going to repuprose our one-to0many relationship.

create table planets (
	planet_id serial primary key,
	planet_name varchar(30),
	life int refrences civilizations(civ_id) unique
);

create table planets (
	planet_id serial primary key,
	planet_name varchar(30),
	life int unique not null,
	life_name
);

create table civilizations(
	civ_id serial primary key,
	civ_name varchar(30)
)
-------------------------------------------------------------------------------------------------------
--Many to Many 
-- As the anme suggest maps entities to multiple other entities 
-- A student has many proffessors, professor have many students 

drop table if exists planets cascade;
drop table if exists moons cascade;
drop table if exists planet_features cascade;

create table planets (
	planet_id serial primary key, 
	planet_name varchar(30)
);

create table features (
	feature_id serial primary key, 
	feature_name varchar(30)
);

--Create a thrid table
-- Multiplicity table / Junction table 

--at minimum we can have this
create table planet_features (
	p_id int references planets(planet_id),
	f_id int references features(feature_id)
);


create table planet_features (
	p_id int references planets(planet_id) on update cascade on delete cascade,
	f_id int references features(feature_id) on update cascade,
	constraint pf_key primary key (p_id, f_id)
);



insert into planets(planet_name) values 
	('Earth'),
	('Mars'),
	('Jupiter');
	
insert into features(feature_name) values
	('Mountains'),
	('Planet scale storms'),
	('Desert');

select * from planets;

select * from features;

select * from planet_features;

insert into planet_features values
((select planet_id from planets where planet_name = 'Earth'),(select feature_id from features where feature_name = 'Desert')), --using sub queries inside of our insert statements is allowed
(1,1); --alternatively we can explicitly put in the appropriate values 
