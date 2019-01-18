package reflection.week09;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Statistician {
    StudentReader studentReader = new StudentReader();
    private List<Student> students = studentReader.getStudents();

    public void calculeate() {
        displayHowManyBoysOrGirls();
        displayParentalLevelOfEducationAlphabetically();
        displayHowManyStudentsScoredHigherthan90();
        displayScored100WhitTheirGenders();
    }


    private void displayHowManyBoysOrGirls() {
        long totalNumberOfStudent = students.stream()
                .count();
        long numberOfMaleStudents = students.stream()
                .filter(student -> "male".equals(student.getGender()))
                .count();

        long numberOfFamaleStudents = totalNumberOfStudent - numberOfMaleStudents;
        System.out.println("Number of all students: " + totalNumberOfStudent);
        System.out.println("Number of female students: " + numberOfFamaleStudents);
        System.out.println("Number of male students: " + numberOfMaleStudents);
    }

    private void displayParentalLevelOfEducationAlphabetically() {
        Set<String> levelOfEducationAlphabetically = students.stream()
                .sorted(Comparator.comparing(Student::getParentalLevelOfEducation).reversed())
                .map(student -> student.getParentalLevelOfEducation())
                .collect(Collectors.toSet());

        // set is unordered data structor
        System.out.println("Parental education levels sorted alphabetically:" + levelOfEducationAlphabetically);


    }

    private void displayHowManyStudentsScoredHigherthan90() {
        long scoreMoreThan90 = students.stream()
                .filter(student -> student.getMathScore() > 90)
                .filter(student -> student.getWritingScore() > 90)
                .filter(student -> student.getReadingScore() > 90)
                .count();

        System.out.println("Number of students with scores higher than 90: " + scoreMoreThan90);
    }


    private void displayScored100WhitTheirGenders() {
        List<String> genders = students.stream()
                .filter(student -> student.getMathScore() == 100)
                .filter(student -> student.getWritingScore() == 100)
                .filter(student -> student.getReadingScore() == 100)
                .map(student -> student.getGender())
                .collect(Collectors.toList());
        long numberOfStudentsScored100 = genders.stream()
                .count();

        System.out.println("Number of students with scores 100: " + numberOfStudentsScored100);
        System.out.println("Genders of these students are: " + genders);
    }
}
