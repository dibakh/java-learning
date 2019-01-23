package exercises.week10.ex02;

import exercises.week09.ex05.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {
    public List<Student> getStudents() {
        return new FileReader().asStream("exercises/week10/ex02/students-performance.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Student(
                        e[0],
                        e[1],
                        Integer.valueOf(e[2]),
                        Integer.valueOf(e[3]),
                        Integer.valueOf(e[4])))
                .collect(Collectors.toList());
    }
}
