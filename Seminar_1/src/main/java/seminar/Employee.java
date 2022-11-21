package seminar;

public abstract class Employee {
    private static int employeeCount;
    protected final String name;
    protected int salary;

    public Employee(String name, int salary) {
        employeeCount++;
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }
}
