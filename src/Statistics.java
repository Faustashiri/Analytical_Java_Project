import java.util.List;

public interface Statistics {
    double calculateAverageScoreByGroup(List<Student> students, boolean isLocal);
    double compareLocalVsIncoming(List<Student> students);
}
