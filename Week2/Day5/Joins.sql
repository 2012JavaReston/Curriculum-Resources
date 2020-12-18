select * from artist;
select * from album;


----INNER JOIN 

select * from artist,album where artist.artist_id = album.artist_id;

select * from artist a, album b where a.artist_id = b.artist_id ;


--Using the keyword Inner join  (return all records that match the condition) 
select * from album b inner join artist a on a.artist_id = b.artist_id; 

select count(*) from album a inner join artist b on a.artist_id = b.artist_id ;

----------LEFT OUTER JOIN

select * from artist a left outer join album b on a.artist_id = b.artist_id ;

select * from artist a left join album b on a.artist_id = b.artist_id ;

select * from album b left outer join artist a on a.artist_id = b.artist_id ;

select count(*) from artist a left outer join album b on a.artist_id = b.artist_id ;

---------RIGHT OUTER JOIN 

select * from artist a right outer join album b on a.artist_id = b.artist_id;


---------FULL OUTER JOIN

select count(*) from artist a full outer join album b on a.artist_id = b.artist_id ;
select * from artist a full outer join album b on a.artist_id = b.artist_id ;

---------SELF JOIN

select * from employee e inner join employee e2 on e.employee_id = e2.reports_to;

select e.first_name, e.title, e2.first_name , e2.title from employee e inner join employee e2 on e.employee_id = e2.reports_to;

---------CROSS JOIN
select count(*) from album b cross join artist a;