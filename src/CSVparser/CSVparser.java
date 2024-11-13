package csvParser;

import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import models.Student;
import models.Course;
import models.Section;
import models.Result;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    public static List<String[]> readCSVFile(String file) {
        var parser = new CSVParserBuilder()
                .withSeparator(';')
                .build();
        try (var reader = new CSVReaderBuilder(new InputStreamReader(new FileInputStream(file)))
                .withCSVParser(parser)
                .build()) {
            return reader.readAll();
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Student> parseToStudents(List<String[]> values) {
        var students = new ArrayList<Student>();

        if (values == null || values.isEmpty()) {
            return students;  // Возвращаем пустой список, если данные отсутствуют
        }

        for (int i = 3; i < values.size(); i++) {
            String firstName = values.get(i)[0];
            String lastName = values.get(i)[1];
            String group = values.get(i)[2];
            boolean isLocal = Boolean.parseBoolean(values.get(i)[3]);
            double totalScore = Double.parseDouble(values.get(i)[4]);

            var student = new Student(firstName, lastName, group, isLocal, totalScore);
            students.add(student);
        }
        return students;
    }

    public static Course parseToCourse(List<String[]> values) {
        if (values == null || values.isEmpty()) {
            return new Course("Unknown Course", new ArrayList<>()); // Возвращаем пустой курс
        }

        String courseName = values.get(0)[0];
        var sections = parseToSections(values);

        return new Course(courseName, sections);
    }

    private static ArrayList<Section> parseToSections(List<String[]> values) {
        var sections = new ArrayList<Section>();

        if (values == null || values.isEmpty()) {
            return sections;  // Возвращаем пустой список, если данные отсутствуют
        }

        for (int i = 5; i < values.size(); i++) {
            String sectionName = values.get(i)[0];
            double maxScore = Double.parseDouble(values.get(i)[1]);

            Section section = new Section(sectionName, maxScore);
            sections.add(section);
        }
        return sections;
    }

    public static ArrayList<Result> parseToResults(List<String[]> values) {
        var results = new ArrayList<Result>();

        if (values == null || values.isEmpty()) {
            return results;  // Возвращаем пустой список, если данные отсутствуют
        }

        for (int i = 3; i < values.size(); i++) {
            String firstName = values.get(i)[0];
            String lastName = values.get(i)[1];
            String sectionName = values.get(i)[2];
            double score = Double.parseDouble(values.get(i)[3]);

            Result result = new Result(firstName, lastName, sectionName, score);
            results.add(result);
        }
        return results;
    }
}
