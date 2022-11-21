package seminar;

import java.util.Random;

public final class Programmer extends Employee implements Gradable {
    private String language;
    int grade = 0;

    public Programmer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public void work() {
        System.out.println("Programmer " + name + " has programmed something in " + language + " language.");
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void updateGrade() {
        Random random = new Random();
        if (random.nextDouble() <= 0.7) {
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
