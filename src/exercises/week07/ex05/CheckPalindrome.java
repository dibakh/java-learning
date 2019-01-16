package exercises.week07.ex05;

import java.util.ArrayList;
import java.util.List;

public class CheckPalindrome {
    public boolean check(String word) {
        word = word.replaceAll(" ", "").toLowerCase();
        String originalWord = word;
        if (word.isEmpty()){
            return false;
        }
        List<String> string = makeReverse(word);
        word = stringToWord(string);

        return word.equals(originalWord);
    }

    private String stringToWord(List<String> string) {
        String word = "";

        for (String character : string) {
            word += character;
        }
        return word;
    }

    private List<String> makeReverse(String word) {
        String[] split = word.split("");
        List<String> reverse = new ArrayList<>();

        for (int position = split.length - 1; position >= 0; position--) {
            reverse.add(split[position]);
        }

        return reverse;
    }
}
