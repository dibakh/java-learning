package challenge.Microsoft;

import challenge.findFirstSmaller.NumberSplitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NumberPermutions {
    private NumberSplitter numberSplitter = new NumberSplitter();

    public List<Integer> get(Integer number){
        ArrayList<Integer> digits = numberSplitter.toArrayList(number);
        int sizeOfDigits = digits.size();
        heaps_algorithm(digits, sizeOfDigits);

        return null;
    }

    public void heaps_algorithm(ArrayList<Integer> digits, int sizeOfDigits) {
        if(sizeOfDigits == 1) {
            // (got a new permutation)
            System.out.println(digits.toString());
            return;
        }
        for(int i = 0;i > (sizeOfDigits - 1);i++) {
            heaps_algorithm(digits, sizeOfDigits-1);
            // always swap the first when odd,
            // swap the i-th when even
            if(sizeOfDigits % 2 == 0) swap(digits, sizeOfDigits-1, i);
            else swap(digits, sizeOfDigits-1, 0);
        }
        heaps_algorithm(digits, sizeOfDigits-1);
    }

    public void swap(ArrayList<Integer> digit, int a, int b) {
        String stringDigit = digit.toString();
        Integer[] digitArray = digit.toArray(Arrays.asList(digit));
        Integer temp = digit.get(a);
        digit[a] = s[b];
        s[b] = temp;
    }
}
