package umbcs680.hw9;
import java.util.ArrayList;
import java.util.List;

class EmployeeDepartment extends Department {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Department department) {
        throw new UnsupportedOperationException("Cannot add departments to an Employee Department");
    }

    @Override
    public void remove(Department department) {
        throw new UnsupportedOperationException("Cannot remove departments from an Employee Department");
    }

    @Override
    public void display() {
        System.out.println("Employee Department: " + name);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public int getEmployeeCount() {
        return employees.size();
    }

    @Override
    public double getAverageSalary() {
        if (employees.isEmpty()) return 0;
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary / employees.size();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
