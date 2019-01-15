package exercises.week07.ex04;

import java.util.ArrayList;
import java.util.List;


public class NumberSplitter {
    public List<Integer> splitNumber(Integer number) {

        String stringNumber = convertToString(number);
        String[] split = split(stringNumber);

        return ConvertToInteger(split);

    }

    private List<Integer> ConvertToInteger(String[] split) {
        List<Integer> splittedNumber = new ArrayList<>();

        for (int position = 0; position < split.length; position++) {
            String currentNumber = split[position];
            Integer number = Integer.valueOf(currentNumber);
            splittedNumber.add(number);
        }

        return splittedNumber;
    }

    private String[] split(String stringNumber) {
        String[] split = stringNumber.split("");

        return split;
    }

    private String convertToString(Integer number) {

        return String.valueOf(number);
    }


}

