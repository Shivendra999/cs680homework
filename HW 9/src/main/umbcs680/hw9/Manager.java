package umbcs680.hw9;
import java.util.ArrayList;
import java.util.List;

class Manager extends Department {
    private List<Department> subDepartments = new ArrayList<>();

    public Manager(String name) {
        super(name);
    }

    @Override
    public void add(Department department) {
        subDepartments.add(department);
    }

    @Override
    public void remove(Department department) {
        subDepartments.remove(department);
    }

    @Override
    public void display() {
        System.out.println("Managerial Department: " + name);
        for (Department department : subDepartments) {
            department.display();
        }
    }

    @Override
    public int getEmployeeCount() {
        int count = 0;
        for (Department department : subDepartments) {
            count += department.getEmployeeCount();
        }
        return count;
    }

    @Override
    public double getAverageSalary() {
        double totalSalary = 0;
        for (Department department : subDepartments) {
            totalSalary += department.getAverageSalary() * department.getEmployeeCount();
        }
        return totalSalary / getEmployeeCount();
    }
}
