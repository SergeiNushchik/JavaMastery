CREATE TABLE IF NOT EXISTS employee
(
    employee_id bigserial   PRIMARY KEY ,
    first_name  VARCHAR(200) NOT NULL ,
    last_name  VARCHAR(200) NOT NULL ,
    department_id integer NOT NULL,
    job_title VARCHAR(254) NOT NULL ,
    gender VARCHAR(254) NOT NULL,
    date_of_birth date NOT NULL
 );





