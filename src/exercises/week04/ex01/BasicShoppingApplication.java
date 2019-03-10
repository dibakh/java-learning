package Ex01;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>();
        String message="Groceries: ";
        display(message, groceries);
        // ------------------------------------------------------------
        String grocery1 = "bananas";
        String grocery2 = "oranges";
        String grocery3 = "tomatoes";

        groceries.add(grocery1);
        groceries.add(grocery2);
        groceries.add(grocery3);

        display(message, groceries);

        // -------------------------------------------------------------

        groceries.remove("oranges");
        display(message, groceries);

        //--------------------------------------------------------------

        groceries.add(grocery3);
        groceries.add(grocery3);
        display(message , groceries);

        //---------------------------------------------------------------

        groceries.remove(2);
        display(message, groceries);

        //---------------------------------------------------------------

        int size = groceries.size();
        System.out.println(message +size);

    }

    private static void display(String message, List<String> groceries) {
        System.out.print(message);
        System.out.println(groceries);

    }

}


//    Derek is checking his fridge thinking about what to buy at the grocery store. He decides to write down a shopping list.
//        Create the BasicShoppingApplication class and write the following instructions in its main method:
//        Create an empty groceries list and display it.
//        Create three Strings that represent three different groceries.
//        Add them to the groceries list and display it.
//        Remove one of them by providing its name as an argument and display the list.
//        Add one of the existing groceries twice and display the list.
//        Remove the third element of the list by providing its position and display it.
//        Display its size.

