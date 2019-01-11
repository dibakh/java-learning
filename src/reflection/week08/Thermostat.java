package reflection.week08;

import java.util.function.Predicate;

public class Thermostat {

    public String skiing(double tempInCelsius) {
        return getMessage(tempInCelsius, n -> n > 0);
    }

    public String sauna(double tempInCelsius) {
        return getMessage(tempInCelsius, n -> n < 80);
    }

    private String getMessage(double tempInCelsius, Predicate<String>) {
        if (b) {
            return tempInCelsius + s;
        }
        return "WARNING !!!";
    }
}
