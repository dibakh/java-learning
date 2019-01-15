package exercises.week07.ex03;

import java.util.Arrays;
import java.util.List;

public class Collection {
    public void createCollection() {
//        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(62, 12, 7, 99, 0, 50, 67, 19, 48);
        System.out.println("numbers are : " + numbers);

        SmallestNumber smallest = new SmallestNumber();
        BiggestNumber biggest = new BiggestNumber();

        Integer smallNumber = smallest.findSmallestNumber(numbers);
        display("smallest number is ", smallNumber);

        Integer bigNumber = biggest.findBiggestNumber(numbers);
        display("biggest number is ", bigNumber);


//        Develop a code that receives a collection of numbers and
//        returns the biggest and the smallest numbers.
//        Create tests for that code.

    }

    private void display(String message, Integer number) {
        System.out.println(message + number);
    }
}
