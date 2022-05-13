SET SERVEROUTPUT ON;
declare
    v_dept Department.DEPARTMENT_NAME%type; 
    cursor c is SELECT DEPARTMENT_NAME FROM Department order by 1;
BEGIN
    dbms_output.put_line('Department Names are :');
    open c;
    loop
        fetch c into v_dept;
        exit when c%NOTFOUND;
            dbms_output.put_line(v_dept);
    end loop;
    close c;
END;

