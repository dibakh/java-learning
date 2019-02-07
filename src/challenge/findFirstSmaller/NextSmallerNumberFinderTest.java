package challenge.findFirstSmaller;

import exercises.week07.ex03.SmallestNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextSmallerNumberFinderTest {

    private NextSmallerNumberFinder smallerNumberFinder = new NextSmallerNumberFinder();

    @Test
    void findNext() {
        Integer actual = smallerNumberFinder.findNext(675920);
        Integer expected = 675902;

        assertEquals(expected, actual);
    }

    @Test
    void findNextOneDigit() {
        Integer actual = smallerNumberFinder.findNext(6);
        Integer expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    void findNextSameDigits() {
        Integer actual = smallerNumberFinder.findNext(666);
        Integer expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    void findNextNaturalOrder() {
        Integer actual = smallerNumberFinder.findNext(123);
        Integer expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    void findNextStartsWithZero() {
        Integer actual = smallerNumberFinder.findNext(1027);
        System.out.println(actual);
        Integer expected = -1;

        assertEquals(expected, actual);
    }
}