package challenge.findFirstSmaller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class NumberSplitterTest {

    @Test
    void split() {
        NumberSplitter numberSplitter = new NumberSplitter();
        Stack<Integer> actual = numberSplitter.toStack(123);
        Stack<Integer> expected = getValues();

        Assertions.assertEquals(expected, actual);

    }

    private Stack<Integer> getValues() {
        Stack<Integer> values = new Stack<>();
        values.push(1);
        values.push(2);
        values.push(3);
        return values;
    }

}