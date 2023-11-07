package cvut.fel.omo.chain;

import cvut.fel.omo.model.ExamResult;

public abstract class ExamHandler {
    protected ExamHandler nextHandler;

    public void setNextHandler(ExamHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void processExam(ExamResult result);
}



