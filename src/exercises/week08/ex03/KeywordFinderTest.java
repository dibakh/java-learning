package exercises.week08.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class KeywordFinderTest {

    private KeywordFinder keywordFinder = new KeywordFinder();


    @Test
    void findElegant() {
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";

        List<String> answer = keywordFinder.findElegant(sentence);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");

        Assertions.assertEquals(expected,answer);

    }

    @Test
    void playful() {
        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";

        List<String> answer = keywordFinder.playful(sentence);
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");

        Assertions.assertEquals(expected,answer);


    }
}