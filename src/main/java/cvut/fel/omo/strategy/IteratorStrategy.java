package cvut.fel.omo.strategy;

import cvut.fel.omo.iterator.Person;
import cvut.fel.omo.iterator.PersonIterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorStrategy implements CommandStrategy {
    @Override
    public void execute() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 35));

        PersonIterator iterator = new PersonIterator(people);

        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
