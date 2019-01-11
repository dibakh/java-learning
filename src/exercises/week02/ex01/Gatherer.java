package exercises.week02.ex01;

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
