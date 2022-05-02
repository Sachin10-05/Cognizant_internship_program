select sub.subject_name, sub.subject_code, st.staff_name
from Subject sub join Staff st on sub.staff_id = st.staff_id
order by sub.subject_code asc;
