package exercises.week07.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameGartherer {
    private Scanner scanner = new Scanner(System.in);

    public List<String> gather() {

        return getName();
    }

    private List<String> getName() {
        List<String> nickNames = new ArrayList<>();

        System.out.println("enter the name : ");
        String name = scanner.nextLine().trim();
        while (!name.isEmpty()){
            nickNames.add(name);
            System.out.println("enter the name : ");
            name = scanner.nextLine().trim();
        }
    return nickNames;
    }
}
