package seminar;

public final class Executive extends Manager {
    int strictness;

    public Executive(String name, int salary, String teamName, int strictness) {
        super(name, salary, teamName);
        this.strictness = strictness;
    }

    @Override
    public void work() {
        System.out.println("Executive " + name + " has done some management work in \"" + teamName + "\" team.");
    }

    public void reduceSalary(Employee employee) {
        int difference = (employee.salary * strictness) / 100;

        System.out.println("Executive " + name + " has reduced salary of " + employee.name +
                " by " + difference + ".");

        employee.salary -= difference;
    }
}
