SELECT * FROM employee;
SELECT * FROM employee WHERE last_name='King';
SELECT * FROM employee WHERE first_name='Andrew' AND reports_to IS NULL;

SELECT * FROM album ORDER BY title DESC;
SELECT first_name FROM customer ORDER BY city ASC;

INSERT INTO genre (name) values ('Heavy Jazz');
INSERT INTO genre (name) values ('Electric Classical');

INSERT INTO employee (last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email)
            values ('Mahaffey', 'Dylan', 'Cashier', 1, '1990-11-20', now(), '265 W Menlo', 'Fresno', 'California', 'United States', '93704', '559-801-8442', NULL, 'dylan.mahaffey@gmail.com');
INSERT INTO employee (last_name, first_name, title, reports_to, birth_date, hire_date, address, city, state, country, postal_code, phone, fax, email)
            values ('Manager', 'Jim', 'Manager', 1, '1990-04-22', now(), '123 Fake St.', 'Fresno', 'California', 'United States', '93710', '559-555-8442', NULL, 'mr.manager@gmail.com');
           
--delete from employee where employee_id = 9 OR employee_id = 10;   

INSERT INTO customer (first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id) 
            values ('Mason', 'Greenwood', 'Best Buy', '321 Real St.', 'Fresno', 'California', 'United States', '93711', '559-555-1234', NULL, 'm.greenwood@manutd.com', 8);
INSERT INTO customer (first_name, last_name, company, address, city, state, country, postal_code, phone, fax, email, support_rep_id) 
            values ('Bruno', 'Fernandes', 'Best Buy', '321 Real St.', 'Fresno', 'California', 'United States', '93711', '559-555-9876', NULL, 'b.fernandes@manutd.com', 8);

UPDATE customer
SET first_name='Robert', last_name='Walter'
WHERE first_name='Aaron' AND last_name='Mitchell';
UPDATE artist
SET name='CCR'
WHERE name='Creedence Clearwater Revival';

SELECT * FROM invoice WHERE billing_address LIKE 'T%';

SELECT * FROM invoice WHERE total  between 15 AND 50;
SELECT * FROM employee where hire_date between '2003-05-01'::date AND '2004-03-01'::date;


/* Doesn't seem like a good idea. */
--alter table invoice drop constraint fk_invoice_customer_id;
--alter table invoice_line drop constraint fk_invoice_line_invoice_id;
--ALTER TABLE invoice ADD CONSTRAINT fk_invoice_customer_id
--    FOREIGN KEY (customer_id) REFERENCES customer (customer_id) ON DELETE CASCADE ON UPDATE NO ACTION;
--ALTER TABLE invoice_line ADD CONSTRAINT fk_invoice_line_invoice_id
--    FOREIGN KEY (invoice_id) REFERENCES invoice (invoice_id) ON DELETE CASCADE ON UPDATE NO ACTION;


create or replace function delete_customer(first_ varchar, last_ varchar)
returns integer
language plpgsql
as
$$
declare
    c_id integer;
    i_id integer;
begin
    select customer_id into c_id from customer where first_name = first_ AND last_name = last_;
    select invoice_id into i_id from invoice where customer_id = c_id;
  
    delete from invoice_line where invoice_id = any(select invoice_id from invoice where customer_id = c_id); 
	delete from invoice  where customer_id = c_id;
	delete from customer where customer_id = c_id;
   
	return i_id;
end;
$$;


select delete_customer('Robert', 'Walter');
















