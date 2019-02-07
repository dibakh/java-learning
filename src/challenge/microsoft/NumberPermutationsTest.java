package challenge.Microsoft;

import challenge.findFirstSmaller.NumberSplitter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class NumberPermutationsTest {

    private NumberPermutations permutations = new NumberPermutations();

    @Test
    void testGet3Digits() {
        Set<String> list = permutations.get(123);

        Assertions.assertEquals(6, list.size());

    }

    @Test
    void testGet6Digits() {
        Set<String> list = permutations.get(123456);

        Assertions.assertEquals(720, list.size());

    }

    @Test
    void testGetRepeatedDigits() {
        Set<String> list = permutations.get(111);

        Assertions.assertEquals(1, list.size());
    }

    @Test
    void testGetWith0Value() {
        Set<String> list = permutations.get(0);

        Assertions.assertEquals(1, list.size());
    }

    @Test
    void testGetWith0ValueInNumber() {
        Set<String> list = permutations.get(110);

        Assertions.assertEquals(3, list.size());
    }
}