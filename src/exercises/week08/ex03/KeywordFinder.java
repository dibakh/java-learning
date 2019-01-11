package exercises.week08.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {
    private List<String> words = new ArrayList<> ( );

    public List<String> findElegant(String sentence) {
        words = getSplitedWords (sentence);
        return find (words, word -> word.startsWith ("ele"));
    }

    public List<String> playful(String sentence) {
        words = getSplitedWords (sentence);
        return find (words, word -> word.endsWith ("ful"));
    }

    private List<String> getSplitedWords(String sentence) {
        String[] split = sentence.split (" ");
        words = Arrays.asList (split);
        return words;
    }

    private List<String> find(List<String> words, Predicate<String> condition) {
        List<String> result = new ArrayList<> ( );
        for ( String word : words ) {
            if (condition.test (word)) {
                result.add (word);
            }
        }
        return result;
    }
}
