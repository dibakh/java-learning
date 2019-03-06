package Ex02.Gatherer;

import Ex01.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {
    Scanner scanner = new Scanner(System.in);

    public List<Hiker> signUp() {
        List<Hiker> hikers = new ArrayList<>();
        String name = askForName();
        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name= askForName();
        }
        return hikers;
    }

    private String askForName() {
        System.out.println("Enter your name : ");
        return scanner.nextLine();
    }
}


//
//    Matilda has organized a hiking day with his friends on the weekend, but she’s not sure who is coming.
//      She decided to create an application so they can sign up that follows the following behavior:
//        It asks for the name of the hiker
//        If they write their name and press enter, they get signed up
//        If they press enter without writing their name, it stops asking for more hikers
//        After that it displays the list of everyone who signed up
//        Develop the following code:
//        Define the Hiker data class that has a name attribute.

//        Define the Gatherer agent class that has a signUp method
//          that asks for hiker’s names indefinitely until it receives an empty String and
//          returns the list of hikers that signed up for the hike.

//        Define the Hike agent class that has a list of hikers as attribute. It has the signUp method that gathers the hikers. It has the method showHikers method that displays the hikers.
//        Define the HikeApplication class that has a main method that uses the Hike class to sign up the hikers and show them on the screen.