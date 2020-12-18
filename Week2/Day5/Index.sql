--Indexes
--Indexes allows for more efficient quering of database records. 
--By indexing a column, we allow faster retrival of information based on that column

--Unique constraints and primary key columns are indexe by default


--Syntax for creating an index on our planets table, for our column planet_name

create index p_name_index on planets (planet_name);

