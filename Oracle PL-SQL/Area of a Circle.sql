DECLARE 
Radius Number(5);
Area Number(7,2);
BEGIN 
for i in 3 .. 7
Loop 
    Area := (3.14)*power(i,2);
    INSERT INTO Circle 
    values (i,Area);
End Loop;
End;
/







