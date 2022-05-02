select s.subject_name, min(m.value) as MIN_MARK
from Subject s join Mark m on s.subject_id = m.subject_id
group by s.subject_name
order by subject_name desc;
