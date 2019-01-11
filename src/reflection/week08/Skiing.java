package reflection.week08;

import java.util.function.Predicate;

public class Skiing extends Trigger {

    private double temp;

    public Skiing(double temp) {
        super(temp);
    }

    @Override
    public Predicate<String> condition() {
        return temp -> temp > 0;
    }

    @Override
    public String display() {
        return temp + " degrees Celsius";
    }
}
