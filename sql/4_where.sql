
select * from [dbo].[EmployeeRecords]
where employeeID = 2

select EmployeeID,FirstName from [dbo].[EmployeeRecords]
where employeeID = 2

select * from dbo.employeerecords where salary>=70000.00

select firstname, lastname, department, salary
from dbo.employeerecords where salary>=75000

select distinct firstname, lastname, department, salary from dbo.employeerecords where salary>=70000.00