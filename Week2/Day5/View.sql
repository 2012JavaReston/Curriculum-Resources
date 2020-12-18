--Creating a view
-- Views create VIRTUAL tables, similar to a result set
--By leveraging view, we don't need to modify our table structre 
--We don't need to query complex select statements over and over again

--A view will reflect any changes that happen to the table. 

select * from employee e ;

delete from employee where employee.first_name = 'Laura';

create view employee_reports_to_view as select e.first_name as manager_name, e.title as manager_title, e2.first_name , e2.title from employee e inner join employee e2 on e.employee_id = e2.reports_to;

select * from employee_reports_to_view;

drop view employee_reports_to_view;