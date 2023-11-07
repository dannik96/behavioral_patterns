package cvut.fel.omo.chain;

import cvut.fel.omo.model.ExamResult;

public class NoOralExamHandler extends ExamHandler {
    @Override
    public void processExam(ExamResult result) {
        if (result.getStudent().getGrade().equals("A") || result.getStudent().getGrade().equals("B")) {
            System.out.println(result.getStudent().getName() + " nemusí na ústní zkoušku.");
            result.setPassed(true);
        } else if (nextHandler != null) {
            nextHandler.processExam(result);
        }
    }
}

