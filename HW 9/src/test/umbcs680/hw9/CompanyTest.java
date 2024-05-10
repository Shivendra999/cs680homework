package umbcs680.hw9;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompanyTest {

    @Test
    public void testEmployeeDepartmentAddRemoveEmployee() {
        EmployeeDepartment department = new EmployeeDepartment("Engineering");
        Employee employee1 = new Employee("John Doe", "Software Engineer", 70000);

        // Adding an employee
        department.addEmployee(employee1);
        assertEquals(1, department.getEmployeeCount(), "Employee count should be 1 after adding an employee");

        // Removing the employee
        department.removeEmployee(employee1);
        assertEquals(0, department.getEmployeeCount(), "Employee count should be 0 after removing the only employee");

        // Removing a non-existing employee should do nothing
        department.removeEmployee(employee1);
        assertEquals(0, department.getEmployeeCount(), "Employee count should remain 0 after attempting to remove a non-existing employee");
    }

    @Test
    public void testEmployeeDepartmentAverageSalary() {
        EmployeeDepartment department = new EmployeeDepartment("Engineering");
        Employee employee1 = new Employee("John Doe", "Software Engineer", 70000);
        Employee employee2 = new Employee("Jane Smith", "Software Engineer", 75000);

        department.addEmployee(employee1);
        department.addEmployee(employee2);

        assertEquals(72500, department.getAverageSalary(), "Average salary should be 72500");
    }

    @Test
    public void testEmployeeDepartmentRemoveNonExistingEmployee() {
        EmployeeDepartment department = new EmployeeDepartment("Engineering");
        Employee employee1 = new Employee("John Doe", "Software Engineer", 70000);
        Employee nonExistingEmployee = new Employee("Jane Smith", "Software Engineer", 75000);

        department.addEmployee(employee1);

        // Removing a non-existing employee should not change employee count
        department.removeEmployee(nonExistingEmployee);
        assertEquals(1, department.getEmployeeCount(), "Employee count should remain 1 after attempting to remove a non-existing employee");
    }

    @Test
    public void testEmployeeDepartmentEmptyAverageSalary() {
        EmployeeDepartment department = new EmployeeDepartment("Engineering");

        // Average salary of an empty department should be 0
        assertEquals(0, department.getAverageSalary(), "Average salary should be 0 for an empty department");
    }

    
}
