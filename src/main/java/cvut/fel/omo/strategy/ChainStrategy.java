package cvut.fel.omo.strategy;

import cvut.fel.omo.chain.ExamHandler;
import cvut.fel.omo.chain.FailHandler;
import cvut.fel.omo.chain.NoOralExamHandler;
import cvut.fel.omo.chain.OralExamHandler;
import cvut.fel.omo.model.ExamResult;
import cvut.fel.omo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ChainStrategy implements CommandStrategy {
    @Override
    public void execute() {
        ExamHandler noOralExamHandler = new NoOralExamHandler();
        ExamHandler oralExamHandler = new OralExamHandler();
        ExamHandler failHandler = new FailHandler();

        noOralExamHandler.setNextHandler(oralExamHandler);
        oralExamHandler.setNextHandler(failHandler);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "A"));
        students.add(new Student("Bob", "C"));
        students.add(new Student("Charlie", "F"));

        List<ExamResult> results = new ArrayList<>();
        for (Student s : students) {
            results.add(new ExamResult(s));
        }

        for (ExamResult e : results) {
            noOralExamHandler.processExam(e);
        }

        // TODO Pomoci iterator vypiste studenty, jejich znamky a jestli zkouskou prosly

    }
}
