package exercises.week09.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApplication {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int position = 1; position <= 20; position++) {
            numbers.add(position);
        }
        System.out.println(numbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(e -> e % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        List<Integer> divisibleByThree = numbers.stream()
                .filter(e -> e < 10)
                .filter(e -> e % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(divisibleByThree);

        numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());

        List<Integer> collectedNumbers = numbers.stream()
                .filter(e -> e > 8)
                .filter(e -> e < 12)
                .collect(Collectors.toList());

        collectedNumbers.stream()
                .forEach(e-> System.out.println("number "+e+" has "+String.valueOf(e).length()+" digits"));


    }
}