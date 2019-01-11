package reflection.week08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThermostatTest {
    private Thermostat skiing = new Skiing(temp -> temp < 0, temp -> temp + " degrees Celsius.");
    private Thermostat sauna = new Sauna(temp -> temp >= 80, temp -> (temp + 273.15) + " degrees Kelvin.");


    @Test
    void testSkiing() {
        String answer = skiing.sense(12.3);
        String expected = "12.3 degrees Celsius.";
        Assertions.assertEquals(expected, answer);

        answer = skiing.sense(-3.0);
        expected = "Warning!";
        Assertions.assertEquals(expected, answer);
    }

    @Test
    void testSauna() {
        String answer = sauna.sense(79.0);
        String expected = "352.15 degrees Kelvin.";
        Assertions.assertEquals(expected, answer);

        answer = sauna.sense(80.0);
        expected = "Warning!";
        Assertions.assertEquals(expected, answer);
    }
}