package exercises.week04.ex12.ex033333.ex03;

public class LetterShifter {

    public String shift(String letter, Integer key) {
        int valueOfLetter = letter.charAt(0);
        int shiftedValue = valueOfLetter + key;
        if (isCapitalLetter(valueOfLetter)) {
            shiftedValue = (shiftedValue - 65) % 26 + 65;
        } else {
            shiftedValue = (shiftedValue - 97) % 26 + 97;
        }
        Character newletter = (char) shiftedValue;
        return newletter.toString();
    }

    private Boolean isCapitalLetter(int valueOfLetter) {
        return valueOfLetter <= 90;
    }
}
