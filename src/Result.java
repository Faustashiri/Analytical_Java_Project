public class Result {
    private Student student;  // Студент
    private Task task;        // Задание
    private int score;        // Оценка за задание

    public Result(Student student, Task task, int score) {
        this.student = student;
        this.task = task;
        this.score = score;
    }

    // Геттеры
    public Student getStudent() { return student; }
    public Task getTask() { return task; }
    public int getScore() { return score; }
}
