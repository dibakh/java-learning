package exercises.week07.ex04;

import java.util.List;
import java.util.Scanner;

public class Number {

    private Scanner scanner = new Scanner(System.in);

    public List<Integer> recieveNumer() {
        NumberSplitter numberSplitter = new NumberSplitter();

        System.out.println("enter the number : ");
        int number = scanner.nextInt();
        Math.abs(number);

        List<Integer> split = numberSplitter.splitNumber(number);

        System.out.println("output : " + split);
        return null;
    }
}
