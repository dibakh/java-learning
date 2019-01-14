package exercises.week07.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MoneyCalculatorTest {

    @Test
    void checkCalculateAllOne() {
        MoneyCalculator moneyCalculator=new MoneyCalculator();

        int total = moneyCalculator.calculate(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));

        Assertions.assertEquals(10,total);

    }

    @Test
    void checkCalculateAllFiva() {
        MoneyCalculator moneyCalculator=new MoneyCalculator();

        int total = moneyCalculator.calculate(Arrays.asList(5,5,5,5,5,5,5,5,5,5,5));

        Assertions.assertEquals(50,total);

    }

    @Test
    void checkCalculateRandomNumbers() {
        MoneyCalculator moneyCalculator=new MoneyCalculator();

        int total = moneyCalculator.calculate(Arrays.asList(3,1,0,5,2,2,1,3,5,4));

        Assertions.assertEquals(26,total);

    }
}