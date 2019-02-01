package exercises.week11.ex04;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Word {
    public Boolean compare(String referenceWord, String currentWord) {
        if (currentWord.length() > referenceWord.length()) {
            String temp = referenceWord;
            referenceWord = currentWord;
            currentWord = temp;
        }

        String finalCurrentWord = currentWord;
        String collect = Pattern.compile("").splitAsStream(referenceWord)
                .filter(e -> !finalCurrentWord.contains(e))
                .collect(Collectors.joining());

        if (!referenceWord.equalsIgnoreCase(currentWord) && collect.length() == 0) {
            return false;
        }
        return collect.length() == 1;
    }


}
