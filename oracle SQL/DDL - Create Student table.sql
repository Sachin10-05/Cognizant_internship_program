/**********************************************************************************************************************************************************************/
                                                                         /*ddl2.sql*/
/**********************************************************************************************************************************************************************/
create table Student(
student_id number primary key,
student_name varchar(30),
address varchar(40),
city varchar(30),
department_id number,
foreign key(department_id) references Department(department_id));
