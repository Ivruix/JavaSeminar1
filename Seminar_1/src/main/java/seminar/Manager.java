package seminar;

public class Manager extends Employee {
    protected String teamName;

    public Manager(String name, int salary, String teamName) {
        super(name, salary);
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("Manager " + name + " has done some management work in \"" + teamName + "\" team.");
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
