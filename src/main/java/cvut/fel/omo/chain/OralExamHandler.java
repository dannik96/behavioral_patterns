package cvut.fel.omo.chain;

import cvut.fel.omo.model.ExamResult;

public class OralExamHandler extends ExamHandler {
    @Override
    public void processExam(ExamResult result) {
        if (result.getStudent().getGrade().equals("C") || result.getStudent().getGrade().equals("D") || result.getStudent().getGrade().equals("E")) {
            System.out.println(result.getStudent().getName() + " musí na ústní zkoušku.");
            result.setPassed(true);
        } else if (nextHandler != null) {
            nextHandler.processExam(result);
        }
    }
}