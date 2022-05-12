CREATE OR REPLACE Procedure select_city
(
    user_id     IN  NUMBER,
    city_details OUT VARCHAR                
)
AS 
BEGIN
    select case
        when city = 'Bangalore'  then
          'User is from Bangalore'
        when city = 'Chennai'    then
         'User is from Chennai'
        else
         'User is from other cities'
    end case
    into city_details
    from contact cnt
    where cnt.id = user_id;
END;
/
   
   
