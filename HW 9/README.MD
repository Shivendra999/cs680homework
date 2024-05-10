# Employee  Management Application

## Description:
This application is designed to manage employee departments within a company. It allows users to add, remove, and manipulate employees within various departments. 

## Composite Design Pattern:
The Composite design pattern is implemented as follows:
- The EmployeeDepartment class represents a department within the company and acts as a composite. It contains a collection of employees and/or other departments.
- The Employee class represents an individual employee within the company and acts as a leaf in the composite structure.
- Both EmployeeDepartment and Employee implement the common interface Component, which defines operations applicable to both departments and employees. This includes operations such as adding and removing employees, calculating average salaries, and providing string representations.
- The hierarchical structure allows for the creation of complex departmental trees, where departments can contain sub-departments and individual employees.

## Unit Tests:
1. Adding and Removing Employees: Tests to verify the functionality of adding and removing employees from a department. This includes testing for adding multiple employees, removing individual employees, and attempting to remove non-existing employees.

2. Calculating Average Salary: Tests to ensure the accurate calculation of the average salary of employees within a department. This includes testing for departments with different numbers of employees and salaries.

3. Handling Empty Departments: Tests to verify the behavior of the application when working with empty departments. This includes testing for calculating the average salary of an empty department and ensuring that removing non-existing employees does not affect department state.

4. String Representation: Tests to validate the correctness of the toString() method for both departments and individual employees. This ensures that the string representations provide meaningful information about the department structure and its employees.

