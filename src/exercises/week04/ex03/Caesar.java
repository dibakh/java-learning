package exercises.week04.ex12.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {
    private LetterShifter letterShifter = new LetterShifter();

    public String cipher(String text, Integer key) {

        return Stream.of(text.split(""))
                .map(s -> s.charAt(0))
                .map(s -> letterShifter(s, key))
                .collect(Collectors.joining());
    }


    private String letterShifter(Character letter, Integer key) {
        if (!Character.isAlphabetic(letter)) {
            return letter.toString();
        }
        return shift(letter, key);
    }

    private String shift(Character letter, Integer key) {
        int shiftedValue = letter + key;
        if (Character.isUpperCase(letter)) {
            shiftedValue = (shiftedValue - 65) % 26 + 65;
        } else {
            shiftedValue = (shiftedValue - 97) % 26 + 97;
        }
        Character cipher = (char) shiftedValue;
        return cipher.toString();
    }
}


