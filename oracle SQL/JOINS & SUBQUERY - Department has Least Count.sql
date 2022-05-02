select d.department_name
from Department d join Student s on d.department_id = s.department_id
group by department_name
having count(s.student_id) = (select min(count(student_id))
                                from Student
                                group by department_id
                            )
order by department_name asc;


