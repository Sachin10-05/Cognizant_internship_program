select department_block_number, count(department_id) as NO_OF_DEPT
from Department 
group by department_block_number
order by NO_OF_DEPT desc;
