/* Write your PL/SQL query statement below */
select  unique_id,name from Employees,EmployeeUNI
where Employees.id=EmployeeUNI.id(+);
