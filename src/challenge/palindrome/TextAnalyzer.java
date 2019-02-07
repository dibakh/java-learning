package challenge.Palindrome;

import java.util.*;

public class TextAnalyzer {
    public Boolean isPalindrome(String text) {
        if(text.length()==1){
            return true;
        }

        Map<String, Integer> characters = getRepeatationOfChars(text.toLowerCase());

        Collection<Integer> repeatations = MakeNumberOfRepeationUniqe(characters);

        ArrayList<Integer> numberOfOddRepeatation = getNumberOfOddRepeatation(repeatations);

        if(numberOfOddRepeatation.size()<2){
            return true;
        }

        return false;
    }

    private ArrayList<Integer> getNumberOfOddRepeatation(Collection<Integer> repeatations) {
        ArrayList<Integer> oddRepeatation = new ArrayList<>();
        for (Integer repeatation : repeatations) {
            if(repeatation%2!=0){
                oddRepeatation.add(repeatation);
            }
        }
        return oddRepeatation;
    }

    private Map<String, Integer> getRepeatationOfChars(String text) {
        text = text.replaceAll(" ", "");
        String[] split = text.split("");
        Map<String, Integer> characters = new HashMap<>();
        for (String letter : split) {
            if (!characters.containsKey(letter)) {
                characters.put(letter, 1);
            } else {
                Integer times = characters.get(letter);
                times++;
                characters.put(letter, times);
            }
        }
        return characters;
    }

    private Collection<Integer> MakeNumberOfRepeationUniqe(Map<String, Integer> characters) {
           return characters.values();
    }
}
