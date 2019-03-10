package Ex06;

import java.util.HashSet;
import java.util.Set;

//    Hansel is preparing himself for a trip and wants to make sure he has packed at least one of everything.
//        Create the AdvancedBackpackApplication class and write the following instructions in its main method:
public class AdvancedIndexApplication {
    public static void main(String[] args) {
//        Create an empty backpack set of Item and display it.
        Set<Item> backpack = new HashSet<>();
        String message = "Backpack: ";
        display(message, backpack);

//        Create three different Item objects.
        Item item1 = new Item("toothpaste");
        Item item2 = new Item("towel");
        Item item3 = new Item("underwear");

//        Add them to the backpack set and display it.
        backpack.add(item1);
        backpack.add(item2);
        backpack.add(item3);

//        To display the Item class create the toString method.
        display("Backpack: ", backpack);

//        Create a new Item with the same name as a previous one and
//        use it to ask if is contained in the set and display the answer.
//        To compare an Item automatically you need to create the equals method in the Item class.  ???????????
//        Specify that two Items are the same if their name is the same.
        Item item4 = new Item("underwear");
        if (backpack.contains(item4)) {
            System.out.println("The backpack contains " + item4.getName());
        }
//        Use the last Item you created to remove the original one from the set.
//        To remove an Item automatically you need to create the equals method in the Item class.
        backpack.remove(item4);
        display(message, backpack);

//        Ask if the element you just removed is not contained in the set and display the answer.
        if (!backpack.contains(item4)) {
            System.out.println("The backpack no longer contains " + item4.getName());
        }

//        Add one of the existing items twice and display the set.
        backpack.add(item1);
        backpack.add(item1);
        display(message, backpack);

//        Display its size.
        System.out.println("Backpack size: " + backpack.size());
    }

    private static void display(String message, Set<Item> backpack) {
        System.out.println(message + backpack);
    }
}

