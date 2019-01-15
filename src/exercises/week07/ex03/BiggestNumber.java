package exercises.week07.ex03;

import java.util.Collections;
import java.util.List;

public class BiggestNumber {
    public Integer findBiggestNumber(List<Integer> numbers) {
        Collections.sort(numbers);
        Integer lastPosition = numbers.size() - 1;

        return numbers.get(lastPosition);

    }
}
