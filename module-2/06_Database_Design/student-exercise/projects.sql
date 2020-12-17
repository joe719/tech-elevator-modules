
       Insert INTO department (department_id, name)
       VALUES (1, 'construction');
       Insert INTO department (department_id, name)
       VALUES (2, 'clerical');
       
       SELECT * from employee;
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('1', 'builder', 'Smith', 'Jeb', 'male', '7/4/56', '8/10/87', '1');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('2', 'builder', 'Algier', 'Rick', 'male', '5/21/56', '9/13/90', '1');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('3', 'builder', 'Wolem', 'Greg', 'male', '9/4/58', '8/21/90', '1');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('4', 'builder', 'Gillem', 'Roberta', 'female', '6/23/89', '8/13/18', '1');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('5', 'clown', 'Witmire', 'Bozo', 'male', '1/2/86', '2/18/12', '2');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('6', 'office manager', 'Reed', 'Art', 'male', '8/21/67', '1/1/12', '2');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('7', 'inside sales', 'Roberts', 'Chris', 'male', '5/4/95', '7/10/19', '2');
       
       INSERT INTO employee (employee_id, job_title, last_name, first_name, gender, birth_date, hire_date, department_id)
       VALUES ('8', 'accountant', 'Richards', 'Paul', 'male', '7/4/56', '4/7/75', '2');
       
       Insert INTO project (project_id, name, start_date)
       VALUES ('1', 'New Charleston Bank', '6/3/12');
       Insert INTO project (project_id, name, start_date)
       VALUES ('2', 'New Charleston Church', '5/3/13');
       
       Insert INTO project_employee (project_id, employee_id)
       VALUES ('1', '3');
       Insert INTO project_employee (project_id, employee_id)
       VALUES ('2', '2');

--BEGIN TRANSACTION;

--        CREATE TABLE department
--(
  --      department_id serial,
    --    name varchar(80) NOT NULL,
        
      --  constraint pk_department primary key (department_id)
--);

--CREATE TABLE employee
--(       
  --      employee_id serial,
    --    job_title varchar(80) NOT NULL,
      --  last_name varchar(80) NOT NULL,
        --first_name varchar(80) NOT NULL,
        --gender varchar(80),
        --birth_date varchar(80) NOT NULL,
        --hire_date varchar(80) NOT NULL,
        --department_id int NOT NULL,

        --constraint pk_employee primary key (employee_id),
        --constraint fk_employee_dept foreign key (department_id) references department (department_id)
--);



--CREATE TABLE project
--(
        --project_id serial,
       -- name varchar(80) NOT NULL,
        --start_date varchar(80) NOT NULL,

        --constraint pk_project primary key (project_id)
--);

--CREATE TABLE project_employee
--(
        --project_id int NOT NULL,
        --employee_id int NOT NULL,

        --constraint pk_pe primary key (project_id, employee_id),
        --constraint fk_employees_project foreign key (project_id) references project (project_id),
        --constraint fk_projects_employee foreign key (employee_id) references employee (employee_id)
--);

--COMMIT


	