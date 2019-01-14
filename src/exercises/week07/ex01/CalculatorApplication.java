package exercises.week07.ex01;

import java.util.List;


public class CalculatorApplication {
    public static void main(String[] args) {
        MoneyCalculator moneyCalculator = new MoneyCalculator();

        List<Integer> payment = MoneyCollector.getList();
        Integer calculated = moneyCalculator.calculate(payment);

        System.out.println("Money collected from friends : " + payment);

        System.out.println("Total of payments are " + calculated + " euro! ");
    }
}
