package reflection.week08;

import java.util.function.Predicate;

public class Sauna extends Trigger {

    private double temp;

    public Sauna(double temp) {
        super(temp);
    }

    @Override
    public Predicate<String> condition() {
        return temp -> temp < 80;

    }

    @Override
    public String display() {
        temp += 273.15;
        return temp + " degrees Kelvin";
    }
}
