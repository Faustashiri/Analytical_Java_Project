import java.util.List;

public class Course {
    private String name;                 // Название курса
    private List<String> topics;         // Темы курса
    private List<Task> tasks;            // Задания курса

    public Course(String name, List<String> topics, List<Task> tasks) {
        this.name = name;
        this.topics = topics;
        this.tasks = tasks;
    }

    // Геттеры
    public String getName() { return name; }
    public List<String> getTopics() { return topics; }
    public List<Task> getTasks() { return tasks; }
}
