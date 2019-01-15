package exercises.week09.ex03;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    private static final int NUMBER_OF_LETTERS = 26;
    public static final int SMALL_A_ASCII_CODE = 97;
    public static final int Big_A_Ascii_Code = 65;

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
        int shiftedAsciiCode = letter + key;
        if (Character.isUpperCase(letter)) {
            shiftedAsciiCode = (shiftedAsciiCode - Big_A_Ascii_Code) % NUMBER_OF_LETTERS + Big_A_Ascii_Code;
        } else {
            shiftedAsciiCode = (shiftedAsciiCode - SMALL_A_ASCII_CODE) % NUMBER_OF_LETTERS + SMALL_A_ASCII_CODE;
        }
        Character cipher = (char) shiftedAsciiCode;
        return cipher.toString();
    }
}