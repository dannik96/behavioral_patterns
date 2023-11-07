package cvut.fel.omo.model;

import cvut.fel.omo.observer.Observer;

public class Student implements Observer {
    private final String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void update(String message) {
        // TODO Nastavit znamku
    }
}


