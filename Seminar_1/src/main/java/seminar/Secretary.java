package seminar;

import java.util.Random;

public final class Secretary extends Employee implements Gradable {
    private String program;
    private int grade = 0;
    public Secretary(String name, int salary, String program) {
        super(name, salary);
        this.program = program;
    }

    @Override
    public void work() {
        System.out.println("Secretary " + name + " has done some secretary work using " + program + ".");
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public void updateGrade() {
        Random random = new Random();
        if (random.nextDouble() <= 0.6) {
            grade++;
        } else {
            grade--;
        }
    }

    @Override
    public int getGrade() {
        return grade;
    }
}
