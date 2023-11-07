package cvut.fel.omo.model;

public class ExamResult {
    private final Student student;
    private boolean passed = false;

    public ExamResult(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setPassed(boolean b) {
        passed = b;
    }
}