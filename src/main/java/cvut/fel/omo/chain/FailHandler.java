package cvut.fel.omo.chain;


import cvut.fel.omo.model.ExamResult;

public class FailHandler extends ExamHandler {
    @Override
    public void processExam(ExamResult result) {
        if (result.getStudent().getGrade().equals("F")) {
            System.out.println(result.getStudent().getName() + " zkoušku neudělal.");
            result.setPassed(false);
        } else if (nextHandler != null) {
            nextHandler.processExam(result);
        }
    }
}
