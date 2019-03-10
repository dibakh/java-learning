package Ex04;

import java.util.Optional;

//    Christmas is coming and Derek’s new working colleges want to organize an “invisible friend” present giving in their company.
//        Create the BasicGiftApplication class and write the following instructions in its main method:
public class BasicGiftApplication {
    public static void main(String[] args) {
//        Create an empty giftBox Optional of String and display it.
        Optional<String> giftBox = Optional.empty();
        String message = "Gift: ";
        displayOptional(message, giftBox);

//        Assign an Optional of String to the giftBox containing an actual present and display it.
        giftBox = Optional.of("Robotoy");
        displayOptional(message, giftBox);


//        Ask if the giftBox is present and display the answer.
        if (giftBox.isPresent()) {
            System.out.println("There is a present in the gift box");
        }
//        Get the value contained in giftBox and display it.
        System.out.println("the gift is a " + giftBox.get());
    }

    private static void displayOptional(String message, Optional<String> giftBox) {
        System.out.println(message + giftBox);
    }
}

