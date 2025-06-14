CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Position VARCHAR(50),
    Salary DECIMAL(10, 2)
);
INSERT INTO Employee (EmployeeID, FirstName, LastName, Position, Salary) VALUES
(1, 'Ivan', 'Ivanov', 'Developer', 80000.00),
(2, 'Anna', 'Petrova', 'Designer', 70000.00),
(3, 'Sergey', 'Sidorov', 'Manager', 90000.00);

UPDATE Employee
SET Salary = 85000.00
WHERE EmployeeID = 1;

DELETE FROM Employee
WHERE EmployeeID = 2;

SELECT * FROM Employee;