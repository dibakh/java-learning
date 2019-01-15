package exercises.week07.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class CollectionTest {

    @Test
    void findSmallestInCollection() {

        List<Integer> numbers = Arrays.asList(62, 12, 7, 99, 0, 50, 67, 19, 48);

        SmallestNumber smallestNumber = new SmallestNumber();
        int number = smallestNumber.findSmallestNumber(numbers);

        Assertions.assertEquals(0, number);

    }

    @Test
    void findBiggestInCollection() {

        List<Integer> numbers = Arrays.asList(62, 12, 7, 99, 0, 50, 67, 19, 48);

        BiggestNumber biggestNumber = new BiggestNumber();
        int number = biggestNumber.findBiggestNumber(numbers);

        Assertions.assertEquals(99, number);

    }
}