package cvut.fel.omo.strategy;

import cvut.fel.omo.model.Student;
import cvut.fel.omo.model.Teacher;

public class ObserverStrategy implements CommandStrategy {
    @Override
    public void execute() {
        Teacher teacher = new Teacher("Profesor Smith");
        Student student1 = new Student("Alice", "");
        Student student2 = new Student("Bob", "");

        teacher.registerObserver(student1);
        teacher.registerObserver(student2);

        teacher.notifyStudentsToSubmitExam(); // Učitel žádá studenty, aby odevzdali zkoušku

        student1.toString();
        student2.toString();
    }
}
