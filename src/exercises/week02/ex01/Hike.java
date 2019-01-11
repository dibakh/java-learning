package exercises.week02.ex01;

import java.util.ArrayList;
import java.util.List;

public class Hike {
    private Gatherer gatherer = new Gatherer();
    private List<Hiker> hikers = new ArrayList<>();

    public void signup() {
        hikers = gatherer.signUp();
    }


    public void showHikers() {
        for (Hiker hiker:hikers) {
            System.out.println("Hiker : " + hiker.getName());
        }
    }
}
