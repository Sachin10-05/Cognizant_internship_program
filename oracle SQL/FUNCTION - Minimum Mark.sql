select s.student_id, min(m.value) as MINIMUM_MARK 
from Student s inner join Mark m on s.student_id = m.student_id
group by s.student_id
order by MINIMUM_MARK asc;
