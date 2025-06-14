CREATE TABLE Persons (
    PersonID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    DateOfBirth DATE
);
INSERT INTO Persons (PersonID, Name, Age, DateOfBirth) VALUES
(1, 'Anna', 30, '1995-06-14'),
(2, 'Boris', 40, '1983-02-20'),
(3, 'Alexey', 24, '1999-06-14'),
(4, 'Daria', 50, '1973-11-05'),
(5, 'Mikhail', 45, '1978-07-15');

SELECT * FROM Persons
WHERE Age > 25 AND Age < 50;

DELETE FROM Persons
WHERE Name LIKE 'A%';

UPDATE Persons
SET Age = Age + 1
WHERE strftime('%m-%d', DateOfBirth) = strftime('%m-%d', 'now');