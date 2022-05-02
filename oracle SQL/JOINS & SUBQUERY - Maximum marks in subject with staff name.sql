select s.staff_name, sub.subject_name, max(m.value) as MAX_MARK
from Staff s join Subject sub on s.staff_id = sub.staff_id join Mark m on m.subject_id = sub.subject_id
group by s.staff_name, sub.subject_name
order by MAX_MARK desc;
