package exercises.week07.ex01;

import java.util.List;

public class MoneyCalculator {
    public Integer calculate(List<Integer> payment) {

        Integer sum = 0;
        for (Integer money : payment) {
            sum += money;
        }

        return sum;
    }
}
