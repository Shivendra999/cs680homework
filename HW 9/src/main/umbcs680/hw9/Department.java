package umbcs680.hw9;
// Component interface
abstract class Department {
    protected String name;

    public Department(String name) {
        this.name = name;
    }

    public abstract void add(Department department);
    public abstract void remove(Department department);
    public abstract void display();
    public abstract int getEmployeeCount();
    public abstract double getAverageSalary();
}
