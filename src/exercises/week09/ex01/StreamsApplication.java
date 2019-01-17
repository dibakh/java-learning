package exercises.week09.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = getNumbers();
        displayEvenNumbers(numbers);
        displayOddNumbers(numbers);
        displayNumbersMoreThan10divisibleBy3(numbers);
        displayNumbersSmallerThan5MultipliedBy3(numbers);
        displayNumbersBetween8to12(numbers);
    }

    private static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int position = 1; position <= 20; position++) {
            numbers.add(position);
        }
        return numbers;
    }

    private static void displayEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers:");
        System.out.println(evenNumbers);
    }

    private static void displayOddNumbers(List<Integer> numbers) {
        List<Integer> displayOddNumbers = numbers.stream()
                .filter(e -> e % 2 == 1)
                .collect(Collectors.toList());
        System.out.println("Odd numbers:");
        System.out.println(displayOddNumbers);
    }

    private static void displayNumbersMoreThan10divisibleBy3(List<Integer> numbers) {
        List<Integer> displayNumbersMoreThan10divisibleBy3 = numbers.stream()
                .filter(e -> e > 10)
                .filter(e -> e % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10:");
        System.out.println(displayNumbersMoreThan10divisibleBy3);
    }

    private static void displayNumbersSmallerThan5MultipliedBy3(List<Integer> numbers) {
        List<Integer> smallerThan5MultipliedBy3 = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3:");
        System.out.println(smallerThan5MultipliedBy3);
    }

    private static void displayNumbersBetween8to12(List<Integer> numbers) {
        List<String> collectedNumbers = numbers.stream()
                .filter(e -> e > 8)
                .filter(e -> e < 12)
                .map(e -> e.toString())
                .map(e -> "number " + e + " has " + e.length() + " digits")
                .collect(Collectors.toList());
        System.out.println("\nDigits of numbers bigger than 8 and smaller than 12:");
        System.out.println(collectedNumbers);
    }
}