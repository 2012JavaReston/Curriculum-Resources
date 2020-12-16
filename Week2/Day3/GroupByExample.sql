create table special(
	special_id serial,
	special_name varchar(30),
	status varchar(30),
	orders int
);

drop table special;

insert into special (special_name, status, orders) values 
	('bob', 'customer',10),
	('bob', 'customer',2),
	('bob', 'customer',17),
	('bob', 'employee',10),
	('bob', 'employee',11),
	('bob', 'customer',13),
	('bob', 'customer',1),
	('bob', 'customer',4),
	('bob', 'customer',3),
	('bob', 'customer',2),
	('bob', 'manager',10),
	('bob', 'customer',2);

--select the number of people that have ordered at least 6 item and group them together
select count(*) from special where orders > 5 group by status;

--grouping them together, but we don't want to consider managers 
select count(*) as number_of_people from special group by status ;

--I want to find the best customers
select count(*) from special where orders > 10 group by status having status = 'customer';

	