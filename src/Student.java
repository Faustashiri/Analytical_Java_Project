public class Student {
    private String firstName;  // Имя студента
    private String lastName;   // Фамилия студента
    private String group;      // Учебная группа студента
    private boolean isLocal;   // Является ли студент местным
    private double totalScore; // Общие баллы за курс

    public Student(String firstName, String lastName, String group, boolean isLocal, double totalScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.isLocal = isLocal;
        this.totalScore = totalScore;
    }

    // Геттеры
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getGroup() { return group; }
    public boolean isLocal() { return isLocal; }
    public double getTotalScore() { return totalScore; }

    // Сеттеры
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setGroup(String group) { this.group = group; }
    public void setLocal(boolean isLocal) { this.isLocal = isLocal; }
    public void setTotalScore(double totalScore) { this.totalScore = totalScore; }
}
