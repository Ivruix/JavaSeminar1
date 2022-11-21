package seminar;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Employee programmer = new Programmer("Igor", 70000, "C++");
        Employee secretary = new Secretary("Ilya", 60000, "Excel");
        Employee manager = new Manager("Vanya", 80000, "Best team ever");
        Executive executive = new Executive("Denis", 100000, "Worst team ever", 20);

        List<Employee> employees = new ArrayList<>();
        employees.add(programmer);
        employees.add(secretary);
        employees.add(manager);
        employees.add(executive);

        programmer.work();
        secretary.work();
        manager.work();
        executive.work();

        executive.reduceSalary(programmer);
        executive.reduceSalary(programmer);

        System.out.println();

        System.out.println("Total employee count: " + Employee.getEmployeeCount());

        for (var employee : employees) {
            if (employee instanceof Gradable gradableEmployee) {
                gradableEmployee.updateGrade();
                employee.setSalary(employee.getSalary() + gradableEmployee.getGrade() * 2000);
            }
        }

        System.out.println();
        System.out.println("New salaries:");

        for (Employee employee : employees) {
            System.out.printf("%s : %d\n", employee.getName(), employee.getSalary());
        }
    }
}