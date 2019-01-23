package exercises.week10.ex03;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsSummarizerTest {
    private List<Sms> smsList = new SmsReader().getLines();

    @Test
    public void testHamAndSpamRaito() {
        String collect = smsList.stream()
                .collect(Collectors.groupingBy(Sms::getTitle, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + claculatePercentage(e.getValue()) + "%")
                .collect(Collectors.joining(", "));

        String expected = "ham 86%, spam 13%";
        Assert.assertEquals(expected, collect);
    }


    private long claculatePercentage(Long value) {
        return (value * 100) / smsList.size();
    }

    @Test
    public void testMostUsedWordInHam() {
        Optional<String> first = smsList.stream()
                .filter(e -> e.getTitle().equals("ham"))
                .map(e -> e.getText())
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();

        Assert.assertEquals("to",first.get());
    }

    @Test
    public void testMostUsedLetterInHam(){
        Optional<String> letter = smsList.stream()
                .filter(e -> e.getTitle().equals("ham"))
                .map(e -> e.getText())
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey())
                .findFirst();

        Assert.assertEquals("e",letter.get());
    }

    //How long is the lonfirstgest spam message?
    @Test
    public void longestSpam(){
        Optional<Integer> lengthOfLongest = smsList.stream()
                .filter(e -> e.getTitle().equals("spam"))
                .map(e -> e.getText())
                .map(e -> e.length())
                .sorted((e1, e2) -> e2.compareTo(e1))
                .findFirst();
        System.out.println(lengthOfLongest.get());
    }
}