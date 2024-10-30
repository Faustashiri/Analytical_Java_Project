public class Assigment {
    private String type;         // Тип задания (упражнение, домашнее задание, семинар)
    private int maxScore;       // Максимальные баллы
    private String difficulty;   // Сложность задания

    public Assigment(String type, int maxScore, String difficulty) {
        this.type = type;
        this.maxScore = maxScore;
        this.difficulty = difficulty;
    }

    // Геттеры
    public String getType() { return type; }
    public int getMaxScore() { return maxScore; }
    public String getDifficulty() { return difficulty; }
}
