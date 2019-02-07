package challenge.findFirstSmaller;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NextSmallerNumberFinder {

    private NumberSplitter numberSplitter = new NumberSplitter();

    public Integer findNext(Integer number) {

        Stack<Integer> digits = numberSplitter.toStack(number);

        if (isNotApplicable(digits)) {
            return -1;
        }

        Integer firstRightDigit = digits.pop();
        String orderedMiddleDigits = getSortedMiddleDigits(digits, firstRightDigit);
        String fixedLeftDigits = join(digits);

        String joined = fixedLeftDigits + firstRightDigit + orderedMiddleDigits;

        if (areCornerCases(number, digits, joined)) return -1;

        return Integer.valueOf(joined);
    }

    private boolean isNotApplicable(Stack<Integer> digits) {
        if (hasOnlyOneDigit(digits)) {
            return true;
        }
        if (hasAllSame(digits)) {
            return true;
        }
        if (isInNaturalOrder(digits)) {
            return true;
        }
        return false;
    }

    private boolean hasOnlyOneDigit(Stack<Integer> digits) {
        return digits.size() == 1;
    }
    private boolean hasAllSame(Stack<Integer> digits) {
        Set<Integer> setOfDigits = new HashSet<>(digits);
        return setOfDigits.size() < 2;
    }

    private boolean isInNaturalOrder(Stack<Integer> digits) {
        String naturalOrder = digits.stream()
                .sorted(Comparator.naturalOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());

        String original = join(digits);
        return original.equals(naturalOrder);
    }

    private String getSortedMiddleDigits(Stack<Integer> digits, Integer firstRightDigit) {
        List<Integer> middleDigits = getMiddleDigits(digits, firstRightDigit);

        return middleDigits.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private List<Integer> getMiddleDigits(Stack<Integer> digits, Integer firstRightDigit) {
        List<Integer> middleDigits = new ArrayList<>();
        Integer nextDigit = digits.pop();

        while (firstRightDigit > nextDigit && !digits.empty()) {
            middleDigits.add(nextDigit);
            nextDigit = digits.pop();
        }
        middleDigits.add(nextDigit);
        return middleDigits;
    }


    private String join(Stack<Integer> digits) {
        return digits.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    private boolean areCornerCases(Integer number, Stack<Integer> digits, String joined) {
        if (digits.empty()) {
            if (Integer.valueOf(joined) > number) {
                return true;
            }
        }
        if (startsWithZero(joined)) {
            return true;
        }
        return false;
    }

    private boolean startsWithZero(String joined) {
        return joined.startsWith("0");
    }}
