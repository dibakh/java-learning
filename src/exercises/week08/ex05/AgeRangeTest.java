package exercises.week08.ex05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AgeRangeTest {

    private AgeRange ageRange = new AgeRange();
    private List<String> nameOfMembers = new ArrayList<>(Arrays.asList("Diba", "Mahtab", "Ashkan", "Sadra"));
    private List<Integer> ageOfMembers = new ArrayList<>(Arrays.asList(40, 15, 18, 20));

    @Test
    void underAge() {
        List<String> answer = ageRange.underAge(nameOfMembers, ageOfMembers);
        List<String> expected = new ArrayList<>(Arrays.asList("Mahtab"));

        Assertions.assertEquals(expected, answer);
    }

    @Test
    void aboveAge() {
        List<String> answer = ageRange.aboveAge(nameOfMembers, ageOfMembers);
        List<String> expected = new ArrayList<>(Arrays.asList("Diba", "Ashkan", "Sadra"));

        Assertions.assertEquals(expected, answer);
    }
}