package Ex05;


import java.util.ArrayList;
import java.util.List;

//    Derek is checking his fridge thinking about what to buy at the grocery store. He decides to write down a shopping list.
//        Create the AdvancedShoppingApplication class and write the following instructions in its main method:
public class AdvancedShoppingApplication {
    public static void main(String[] args) {
//        Create an empty groceries list of Grocery and display it.
        List<Grocery> groceries = new ArrayList<>();
        String message = "Groceries: ";
        displayList(message, groceries);

//        Create three different Grocery objects.
        Grocery object1 = new Grocery("bananas");
        Grocery object2 = new Grocery("orange");
        Grocery object3 = new Grocery("tomato");

//        Add them to the groceries list and display it. To display the Grocery class create the toString method.
        groceries.add(object1);
        groceries.add(object2);
        groceries.add(object3);
        displayList(message, groceries);

//        Create a new Grocery with the same name as a previous one and
        Grocery newGrocery = new Grocery("orange");
//        use it to remove the original one from the list.
//        To remove a Grocery automatically you need to create the equals method in the Grocery class.
//        Specify that two Grocery are the same if their name is the same.
//        ???????????????????????????????????
        groceries.remove(newGrocery);
        displayList(message, groceries);

//        Add one of the existing groceries twice and display the list.
        groceries.add(object3);
        groceries.add(object3);
        displayList(message, groceries);

//        Remove the third element of the list by providing its position and display it.
        groceries.remove(3);
        displayList(message, groceries);

//        Display its size.
        message = "Groceries size: ";
        System.out.println(message + groceries.size());
    }

    private static void displayList(String message, List<Grocery> groceries) {
        System.out.print(message);
        System.out.println(groceries.toString());
//        for (Grocery grocery : groceries) {
//            System.out.print(grocery.getName());
//
//        }
        System.out.println();
    }

}
