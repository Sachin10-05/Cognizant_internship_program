CREATE OR REPLACE PROCEDURE CHECK_AGE_ELIGIBILITY(

 v_id IN EMPLOYEE.EMPID%TYPE, 
 v_name IN EMPLOYEE.EMPNAME%TYPE, 
 v_age IN EMPLOYEE.AGE%TYPE)
AS 
     INVALID_AGE EXCEPTION;
BEGIN
    if v_age <18
    then 
        RAISE INVALID_AGE;
    else
        insert into EMPLOYEE values(v_id,v_name,v_age);
        commit;
        dbms_output.put_line('Age valid - Record inserted');
    end if;
EXCEPTION
    when INVALID_AGE then
        dbms_output.put_line('Age invalid - Record not inserted');
END CHECK_AGE_ELIGIBILITY;

