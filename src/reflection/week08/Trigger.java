package reflection.week08;

import java.util.function.Predicate;

public abstract class Trigger {

    private double temp;

    public Trigger(double temp) {
        this.temp = temp;
    }

    public abstract Predicate<String> condition();

    public abstract String display();


}
