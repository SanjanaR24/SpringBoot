
-- create table Employee
create table Employee (first_name varchar(50),last_name varchar(50), job_start_date date, salary integer);
describe Employee;
alter table Employee add department varchar(50);
insert into Employee values ('Derek', 'Shephard','2023-04-08', 70000,'HR');
select * from Employee;
select * from Employee where salary=(select max(salary) from Employee);
SELECT * FROM Employee ORDER BY salary desc;

select * from Employee where job_start_date>=date_sub(curdate(), interval 6 month);
select department,count(*) as count from Employee group by department;



describe consultant_detail;
select * from consultant_detail;
insert into consultant_detail values ('102','301','roshini','racha','sangu@gmail.com','8102780087');

-- query to update email_address on the consultant_detail table
update consultant_detail set Email_address="sanjana.reddy@gmail.com" where Id="101";

-- to find total number of submissions for each constulant.
SELECT c.Id, c.First_name, COUNT(s.id) AS total_submissions
FROM consultant_detail c
JOIN submission s ON c.id = s.Consultant_id
GROUP BY c.Id;

select * from consultant_detail;
describe submission;

-- to find total number of submissions for each constulant by each submission day
select Consultant_id,Submission_date,count(*) as Total_submissions
from submission 
group by Submission_date, Consultant_id;


-- to delete all submissions where "rate" is null
delete from submission where Pay_rate is null;


-- Given a lead name and submission date, Write a SQL query to find the submissions.
select * from lead_detail;

select s.*
from submission s
join consultant_detail c on c.Id=s.Consultant_id
join lead_detail l on l.Id=c.Lead_id
where l.first_name="Tejan" and Submission_date="2023-06-20";


-- query to find the number of submissions by each lead.
SELECT l.First_name,l.Last_name, COUNT(*) AS Count
FROM submission s
join consultant_detail c on c.Id=s.Consultant_id
left join lead_detail l on l.Id=c.Lead_id
GROUP BY l.First_name,l.Last_name;






