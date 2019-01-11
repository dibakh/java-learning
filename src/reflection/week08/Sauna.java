package reflection.week08;

import java.util.function.Function;
import java.util.function.Predicate;

public class Sauna extends Thermostat {
    public Sauna(Predicate<Double> condition, Function<Double, String> display) {
        super(condition, display);
    }
}
