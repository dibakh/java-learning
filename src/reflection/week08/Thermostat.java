package reflection.week08;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class Thermostat {

    private Predicate<Double> condition;
    private Function<Double, String> display;

    public Thermostat(Predicate<Double> condition, Function<Double, String> display) {
        this.condition = condition;
        this.display = display;
    }

    public Predicate<Double> getCondition() {
        return condition;
    }

    public Function<Double, String> getDisplay() {
        return display;
    }

    public String sense(Double temperature) {
        String message = getDisplay().apply(temperature);
        if (getCondition().test(temperature)) {
            message = "Warning!";
        }
        return message;
    }
}
