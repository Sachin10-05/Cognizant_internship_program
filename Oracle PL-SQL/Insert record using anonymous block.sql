DECLARE
d_id Department.DEPARTMENT_ID%type;
d_name Department.DEPARTMENT_NAME%type;
d_location Department.LOCATION_ID%type;

BEGIN
    SELECT max(DEPARTMENT_ID)+10 INTO d_id 
    FROM Department;
    
    INSERT INTO Department(DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION_ID)
           VALUES (d_id, 'TESTING', 'CHN-102');
    COMMIT;
END;
/
