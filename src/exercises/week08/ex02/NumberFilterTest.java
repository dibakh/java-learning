package exercises.week08.ex02;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NumberFilterTest {
    private NumberFilter numberFilter = new NumberFilter ( );

    private static List<Integer> getNumbers() {
        List<Integer> numbers = new ArrayList<> (Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9));
        return numbers;
    }

    private List<Integer> numbers = getNumbers ( );

    @Test
    public void getEven() {
        List<Integer> answer = numberFilter.getEven (numbers);
        List<Integer> expected = Arrays.asList (2, 4, 6, 8);

        Assertions.assertEquals(expected,answer);
    }

    @Test
    public void getOdd() {

        List<Integer> answer = numberFilter.getOdd (numbers);
        List<Integer> expected = Arrays.asList (1, 3, 5, 7, 9);

        Assertions.assertEquals(expected,answer);
    }
}