package exercises.week08.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class tryLambda {
    public static void main(String[] args) {

        List<String> names = new ArrayList<> (Arrays.asList
                ("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));

        System.out.println ("----- Part1 -----");
        System.out.println (names);

        System.out.println ("----- Part2 -----");
        names.removeIf (name -> name.endsWith ("e"));
        System.out.println (names);

        System.out.println ("----- Part3 -----");
        names.replaceAll (name -> name.toUpperCase ( ));
        System.out.println (names);

        System.out.println ("----- Part4 -----");
        names.removeIf (name -> name.length ( ) < 6);
        System.out.println (names);

        System.out.println ("----- Part5 -----");
        names.forEach (name -> System.out.println (name));

    }
}
