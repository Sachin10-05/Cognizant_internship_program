select NAME, concat((substr(NAME,0,3)), (substr(PHNO,0,3))) as PASSWORD
from USERS
order by NAME asc;
