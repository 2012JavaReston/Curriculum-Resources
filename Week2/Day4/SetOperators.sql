--SET Operators
-- Add records by columns
-- UNION, UNION ALL, INTERSECT, EXCEPT

CREATE TABLE TA(
    nums int,
    chars varchar(10)
    );
   
   
CREATE TABLE TB(
    other_nums int,
    other_chars varchar(10)
    );
    

INSERT INTO TA VALUES(1,'a');
INSERT INTO TA VALUES(2,'b');
INSERT INTO TA VALUES(3,'c');
INSERT INTO TA VALUES(4,'d');
insert into TA values(5, 'z');

INSERT INTO TB VALUES(3, 'c');
INSERT INTO TB VALUES(4, 'd');
INSERT INTO TB VALUES(5, 'e');
INSERT INTO TB VALUES(6, 'f');
INSERT INTO TB VALUES(7, 'g');

select * from TA;
select * from TB;

select nums, chars from TA union select other_nums, other_chars from TB order by nums;
--UNION: Returns values that exist in both tables, ignoring duplicate values

select * from TA union all select * from TB;
--UNION ALL: Returns values taht exist in both tables, also includes duplicate values 

select nums from TA intersect select other_nums from TB;

(select nums as numb from TA as TableA) intersect (select other_nums as numbers from TB as TableB);
--INTERSECT: Only the records that exist both table

select nums, chars from TA except select other_nums, other_chars from TB;

select other_nums, other_chars from TB except select nums, chars from TA;
--EXCEPT: Returns records that ONLY exist on the left hand side

(select nums, chars from TA union select other_nums, other_chars from TB order by nums) 
	except 
		(select nums, chars from TA intersect select other_nums, other_chars from TB) order by nums;
	
(select * from TA except select * from TB)
	union 
		(select * from TB except select * from TA) order by nums;


select * from genre;
select * from category;
	
select name, genre_id as id from genre intersect select name, category_id from category c2 order by id;
