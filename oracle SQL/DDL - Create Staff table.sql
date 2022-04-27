/*ddl3.sql*/

create table Staff(
staff_id number primary key,
staff_name varchar(30),
department_id number,
foreign key (department_id) references department(department_id)
);
