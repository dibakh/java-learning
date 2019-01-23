package exercises.week10.ex02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentsStatistician {
    public static void main(String[] args) {
        List<Student> students = new StudentReader().getStudents();

        System.out.println("How manyucation times does each parent level of education appear? ");
        Map<String, Long> groupedByParentEducation = displayHowManyTimesEacstudentshParentLevelOfEducationAppear(students);
        System.out.println(groupedByParentEducation);

        System.out.println("Parent education level appearances sorted top bottom:");
        displayParentalEducationSorted(groupedByParentEducation);

        Long numberOfStudents = displayStudentsWithParentalEducationMasterDegreeAndScoredHigher60(students);
        System.out.println("Number of students with high parent education and lower scores than 60: " + numberOfStudents);

        System.out.println("Genders and average scores of the top four average score students: ");
        displayFirstThreeAvgWithGender(students);

        Boolean isAnyMatch = displayScoredAtLeast95AndParentalEducationHighSchool(students);
        System.out.println("Is there any student with a parent education level of some high school that has at least 95 in every topic? "
                + isAnyMatch);
    }

    private static Boolean displayScoredAtLeast95AndParentalEducationHighSchool(List<Student> students) {
        return students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("some high school"))
                .anyMatch(checkCondition());
    }

    private static Predicate<Student> checkCondition() {
        return e -> e.getReadingScore() > 95 && e.getWritingScore() > 95 && e.getMathScore() > 95;
    }

    private static void displayFirstThreeAvgWithGender(List<Student> students) {
        students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("some high school"))
                .map(e -> avgCalculator(e) + " | " + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .forEach(System.out::println);
    }

    private static int avgCalculator(Student e) {
        return (e.getReadingScore() + e.getWritingScore() + e.getMathScore()) / 3;
    }

    private static long displayStudentsWithParentalEducationMasterDegreeAndScoredHigher60(List<Student> students) {
        return students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equals("master's degree"))
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .count();
    }


    private static void displayParentalEducationSorted(Map<String, Long> groupedByParentEducation) {
        groupedByParentEducation.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
    }

    private static Map<String, Long> displayHowManyTimesEacstudentshParentLevelOfEducationAppear(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation, Collectors.counting()));
    }
}
