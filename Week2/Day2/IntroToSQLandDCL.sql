--PostgresSQL 

--before relational databases? 
--	Hierarchical database models, where everything followed a tree like structure. 
	
--We're going to be working with relational databases.
--	This is where our data "structures" can have access to our other data strctures. 
--	
--Currently we have established connection to our postgresSQl database on the cloud 

--What is a schema? 
--	database can have multiple schemas, they define a collection of database obejcts that are to 
--		be associated with a database (.e. tables)
		
		
--What is sql (structured query language) ?
--	Structured query language, it's the language we speak to the database in it's own language. 
--	Its syntax resembles a spoken language. 
--	sql is split up into sublanguages. 
--		DML (data manipulation language)
--		DDL (data defintion language)
--		TCL (transaction control language)
--		DCL (data control language)
--		DQL (data query language )
		
--DCL:
--	data control language - is used to provide privileges to users. 
--		by using it you can create new logins to your database and 
--		provide fine grained control over what users can do or access. 
--		Grant and Revoke 

create role rando_login LOGIN password 'p4ssword';

grant all privileges on schema public to rando_login;

GRANT SELECT ON TABLE public.planets TO rando_login;
GRANT INSERT ON TABLE public.planets TO rando_login;
GRANT ALL ON TABLE public.planets TO rando_login;

		
		
		
		
		
	