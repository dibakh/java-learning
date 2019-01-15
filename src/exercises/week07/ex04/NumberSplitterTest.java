package exercises.week07.ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberSplitterTest {

    @Test
    void fourDigitNumber() {
        Integer number=4653;

        NumberSplitter numberSplitter = new NumberSplitter();

        List<Integer> answer = numberSplitter.splitNumber(number);
        List<Integer> expect = Arrays.asList(4,6,5,3);

        Assertions.assertEquals(expect,answer);
    }

    @Test
    void sixDigitNumber() {
        Integer number=193822;

        NumberSplitter numberSplitter = new NumberSplitter();

        List<Integer> answer = numberSplitter.splitNumber(number);
        List<Integer> expect = Arrays.asList(1,9,3,8,2,2);

        Assertions.assertEquals(expect,answer);
    }
}