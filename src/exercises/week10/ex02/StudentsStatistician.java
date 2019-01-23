package exercises.week10.ex02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StdentsStatistician {
    StudentReader studentReader = new StudentReader();
    private List<Student> students = studentReader.getStudents();

    public  void calculate() {
        displayHowManyTimesEachParentLevelOfEducationAppear();
//Which are the different parent level of educations sorted from most appearing to least appearing?
//How many students have parents with a master’s degree and lower grades than 60 on each topic?
//Which genders and average scores do the three students with the highest average score have?
//Is there any student with a parent education level of some high school that has at least 95 in every topic?
    }

    private void displayHowManyTimesEachParentLevelOfEducationAppear() {
        System.out.println("How many times does each parent level of education appear? ");
        Map<String, Long> groupedByParentEducation = students.stream()
                .collect(Collectors.groupingBy(Student::getParentalLevelOfEducation, Collectors.counting()));
        System.out.println(groupedByParentEducation);

    }
}
