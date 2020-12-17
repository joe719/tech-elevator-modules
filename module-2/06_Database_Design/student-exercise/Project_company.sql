

BEGIN TRANSACTION;

CREATE TABLE employee
(
employee_number serial,
job_title varchar(160) NOT NULL,
last_name varchar(160) NOT NULL,
first_Name varchar(160) NOT NULL,
gender varchar(160),
birth_date varchar(160) NOT NULL,
hire_date varchar(160) NOT NULL,
Department varchar(160) NOT NULL,

constraint pk_employee primary key (employee_number)

);