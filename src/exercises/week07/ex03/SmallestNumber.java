package exercises.week07.ex03;

import java.util.Collections;
import java.util.List;

public class SmallestNumber {
    public Integer findSmallestNumber(List<Integer> numbers) {
        Collections.sort(numbers);

        return numbers.get(0);
    }
}
