package exercises.week09.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {
    private List<String> names = new FileReader()
            .asList("exercises/week09/ex02/names.txt");

    @Test
    void namesShorterThanfourChar() {
        List<String> result = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void endWithM() {
        List<String> result = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void containsEorR() {
        List<String> result = names.stream()
                .filter(e -> e.contains("e"))
                .filter(e -> e.contains("r"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void exaclyFourCharLength() {
        List<String> result = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a"))
                .filter(e -> e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected, result);
    }
}
