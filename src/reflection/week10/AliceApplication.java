package reflection.week10;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AliceApplication {
    public static void main(String[] args) {
        AliceSummarizer aliceSummarizer = new AliceSummarizer();

        long numberOfWords = aliceSummarizer.getNumberOfWords();
        System.out.println("\nHow many words are in the book? " + numberOfWords);

        long numberOfDistinctWord = aliceSummarizer.getNumberOfDistinctWord();
        System.out.println("\nHow many distinct words are in the book? " + numberOfDistinctWord);

        Optional<String> longestWords = aliceSummarizer.getLongestWords();
        if (longestWords.isPresent()) {
            System.out.println("\nWhich words belong to the group of the longest words? " + longestWords.get());
        } else {
            System.out.println("\nlongest words did NOt found");
        }

        List<Map.Entry<String, Long>> mostAppearingWord = aliceSummarizer.get5MostAppearingWord();
        System.out.println("\nMost appearing 5 words: ");
        for (Map.Entry<String, Long> word : mostAppearingWord) {
            System.out.println(word.getKey() + " | " + word.getValue());
        }

        List<Map.Entry<String, Long>> mostAppearingLetter = aliceSummarizer.get5MostAppearingLetter();
        System.out.println("\nMost appearing 5 letter: ");
        for (Map.Entry<String, Long> word : mostAppearingLetter) {
            System.out.println(word.getKey() + " | " + word.getValue());
        }
        long howManyTimesAliceAppears = aliceSummarizer.getHowManyTimesAliceAppears();
        System.out.println("\nHow many times does the name Alice appear?" + howManyTimesAliceAppears);
    }
}
