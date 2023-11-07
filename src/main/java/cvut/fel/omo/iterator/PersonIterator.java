package cvut.fel.omo.iterator;

import jdk.jshell.spi.ExecutionControl;

import java.util.Iterator;
import java.util.List;

public class PersonIterator implements Iterator<Person> {
    private final List<Person> people;
    private int currentIndex;

    public PersonIterator(List<Person> people) {
        this.people = people;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Person next() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}