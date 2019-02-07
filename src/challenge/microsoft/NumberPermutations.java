package challenge.microsoft;

import challenge.findFirstSmaller.NumberSplitter;

import java.util.*;

public class NumberPermutations {
    private NumberSplitter numberSplitter = new NumberSplitter();
    private List<String> results = new ArrayList<>();

    public Set<String> get(Integer number) {
        Integer[] digits = numberSplitter.toArray(number);
        int sizeOfDigits = digits.length;
        return new HashSet<>(heaps_algorithm(digits, sizeOfDigits));
    }

    private List<String> heaps_algorithm(Integer[] digits, int numberOfDigits) {
        if (numberOfDigits == 1) {
            String resultsInStrings = Arrays.toString(digits);
            results.add(resultsInStrings);
        } else {
            for (int index = 0; index < numberOfDigits; index++) {
                heaps_algorithm(digits, numberOfDigits - 1);

                int current = (numberOfDigits % 2 == 0) ? index : 0;

                int temporary = digits[numberOfDigits - 1];
                digits[numberOfDigits - 1] = digits[current];
                digits[current] = temporary;
            }
        }
        return results;
    }
}
