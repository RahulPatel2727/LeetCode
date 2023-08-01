# Write your MySQL query statement below
select ifnull(max(salary),null) as secondhighestsalary
from employee
where salary < some(select max(salary) from employee)