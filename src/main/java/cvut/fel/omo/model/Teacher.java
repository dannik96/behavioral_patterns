package cvut.fel.omo.model;

import cvut.fel.omo.observer.Observer;
import cvut.fel.omo.observer.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(generateRandomChar());
        }
    }

    public String generateRandomChar() {
        Random random = new Random();
        char randomChar = (char) ('A' + random.nextInt(6)); // Generovat náhodné písmeno 'A' až 'F'
        return String.valueOf(randomChar); // Převést znak na řetězec
    }

    // Metoda pro učitele, aby oznámil studentům, že mají odevzdat zkoušku
    public void notifyStudentsToSubmitExam() {
        notifyObservers("Studenti, prosím odevzdejte své zkoušky.");
    }
}

