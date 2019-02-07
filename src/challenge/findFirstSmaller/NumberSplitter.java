package challenge.findFirstSmaller;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberSplitter {

    public Stack<Integer> toStack(Integer number) {
        Stack<Integer> stack = new Stack<>();
        Stream.of(number.toString().split(""))
                .map(Integer::valueOf)
                .forEach(stack::push);
        return stack;
    }

    public ArrayList<Integer> toArrayList(Integer number) {
        ArrayList<Integer> digits = new ArrayList<>();
        Stream.of(number.toString().split(""))
                .map(Integer::valueOf)
                .forEach(digits::add);
        return digits;
    }

    public Integer[] toArray(Integer number) {
        List<Integer> list=toArrayList(number);

        int size = list.size();

        Integer digitArray[]=new Integer[(int) size];
        for (int position = 0; position < size; position++) {
            digitArray[position]=list.get(position);
        }
        return digitArray;
    }
}
