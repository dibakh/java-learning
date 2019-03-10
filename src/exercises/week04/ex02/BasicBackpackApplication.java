package Ex02;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {

    //    Hansel is preparing himself for a trip and wants to make sure he has packed at least one of everything.
//        Create the BasicBackpackApplication class and write the following instructions in its main method:
    public static void main(String[] args) {
        //        Create an empty backpack set and display it.
        Set<String> backpack = new HashSet<>();
        String message = "Backpack: ";
        displaySet(message, backpack);

        //        Create three Strings that represent three different items.
        String item1 = "toothbrush";
        String item2 = "towel";
        String item3 = "underwear";

        //        Add them to the backpack set and display it.
        backpack.add(item1);
        backpack.add(item2);
        backpack.add(item3);
        displaySet(message, backpack);

        //        Ask if one of them is contained in the set and display the answer.
        if (backpack.contains(item3)) {
            System.out.println("The backpack contains "+ item3);
        } else {
            System.out.println("The backpack contains " + item3);
        }


        //        Remove one of them by providing its name as an argument and display the set.
        backpack.remove("underwear");
        displaySet(message, backpack);

        //        Ask if the element you just removed is not contained in the set and display the answer.
        if (!backpack.contains(item3)) {
            System.out.println("The backpack no longer contains " + item1);
        }
        displaySet(message, backpack);



        //        Add one of the existing items twice and display the set.
        backpack.add(item2);
        backpack.add(item2);
        displaySet(message, backpack);

        //        Display its size.
        System.out.println(message+backpack.size());


    }

    private static void displaySet(String message, Set<String> backpack) {
        System.out.print(message);
        System.out.println(backpack);
    }
}



