select s.student_name, m.value
from Student s join Mark m on s.student_id = m.student_id join Subject sub on sub.subject_id = m.subject_id
where sub.subject_name = 'Theory of Computation'
order by s.student_name;
