select department_name, count(student_id) as STUDENT_COUNT
from Department d join Student s on d.department_id = s.department_id
group by department_name
order by department_name asc;
