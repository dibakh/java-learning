package exercises.week07.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {
    private static List<Integer> payments= gatherMoney();

    public static List<Integer> gatherMoney(){
        Random random=new Random();
        List<Integer> payment=new ArrayList<>();
        for (int friend = 0; friend < 10; friend++) {
            int paid = random.nextInt(5) + 1;
            payment.add(paid);
        }

        return payment;
    }

    public static List<Integer> getList(){

        return  payments;
    }

}
