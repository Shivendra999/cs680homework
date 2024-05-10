package umbcs680.hw9;
public class Company {
    public static void main(String[] args) {
        // Creating departments
        Manager ceo = new Manager("CEO Office");
        Manager engineering = new Manager("Engineering");
        Manager hr = new Manager("HR");

        // Creating employee departments
        EmployeeDepartment engineeringDept = new EmployeeDepartment("Engineering Department");
        engineeringDept.addEmployee(new Employee("John Doe", "Software Engineer", 70000));
        engineeringDept.addEmployee(new Employee("Jane Smith", "Software Engineer", 75000));
        engineering.add(engineeringDept);

        EmployeeDepartment hrDept = new EmployeeDepartment("HR Department");
        hrDept.addEmployee(new Employee("Emily Brown", "HR Manager", 90000));
        hr.add(hrDept);

        // Adding departments to CEO office
        ceo.add(engineering);
        ceo.add(hr);

        // Displaying company structure
        ceo.display();
        System.out.println("Total Employees: " + ceo.getEmployeeCount());
        System.out.println("Average Salary: $" + ceo.getAverageSalary());
    }
}