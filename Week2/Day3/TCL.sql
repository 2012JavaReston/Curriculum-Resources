--TCL
--Transaction control language
-- commit, savepoint, rollback

--Transaction? 
-- A group of queries, bundeled together so that they all execute or none of them. 
--Query?
-- A single sql statement.

select *from planets;

insert into planets (planet_name, planet_description , rings) values('bob4', 'bobby4',false);
commit;


begin;
--Trnsaction block will go inside of here 
insert into planets (planet_name, planet_description, rings, number_of_moons) values
	('Mercury', 'Never too close', true, 0),
	('Venus', 'Getting a tad warm', false, 0),
	('Earth', 'cradle of civilization', false, 1),
	('Mars', 'Earth 2.0', false, 2),
	('Jupiter', 'Big', true, 67),
	('Saturn', 'very ringy', true, 82),
	('Uranus', 'blue', true, 27),
	('Neptune', 'getting nippy', true, 14),
	('Pluto', 'you cannot get rid of me', false, 2);
	savepoint solar_system;
	--^^ we've created a savepoint for our transaction. 
	truncate planets;
	--^^ we delete all the planets, we don't want that 
	rollback to solar_system;
	delete from planets where planet_name = 'Pluto';
	savepoint proper_solar_system;
commit;


--Transactions have to follow ACID
--Atomicity: All the queries execute or none of them execute. 
--Consistency: Does not violate referential integrity (the table structures aren't changed)
--Isolated: Transactions don't interfere with each other. 
--Durable: Data persists (changes to the dtatbase still exists, even if the local version of it breaks)


--Isolation levels
--Explain what these isolation levels and what level of isolation they provide and what they protect against.
 
--read uncommitted 
--read committed 
--repeatable read 
--serializable 


select * from planets;
