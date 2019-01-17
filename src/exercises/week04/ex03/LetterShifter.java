package exercises.week04.ex12.ex03;

public class LetterShifter {

    public String shift(String letter, Integer key) {
        int asciiCode = letter.charAt(0);
        int shiftedAsciiCode = asciiCode + key;

        if (isCapitalLetter(asciiCode)) {
            shiftedAsciiCode = (shiftedAsciiCode - 65) % 26 + 65;
        } else {
            shiftedAsciiCode = (shiftedAsciiCode - 97) % 26 + 97;
        }
        Character shiftedLetter = (char) shiftedAsciiCode;
        return shiftedLetter.toString();
    }

    private Boolean isCapitalLetter(int valueOfLetter) {
        return valueOfLetter <= 90;
    }
}
