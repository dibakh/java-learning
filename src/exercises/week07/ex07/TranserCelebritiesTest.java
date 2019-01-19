package exercises.week07.ex07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TranserCelebritiesTest {
    TranserCelebrities transerCelebrities = new TranserCelebrities();

    @Test
    void IsPossible() {
        Integer numberOfCelebrities = 17;
        Integer numberOf1PersonVehicles = 3;
        Integer numberOf5PersonVehicles = 3;

        Boolean result = transerCelebrities.transport(numberOfCelebrities, numberOf5PersonVehicles, numberOf1PersonVehicles);

        Assertions.assertTrue(result);
    }

    @Test
    void IsNotPossible() {
        Integer numberOfCelebrities = 20;
        Integer numberOf5PersonVehicles = 2;
        Integer numberOf1PersonVehicles = 3;

        Boolean result = transerCelebrities.transport(numberOfCelebrities, numberOf5PersonVehicles, numberOf1PersonVehicles);

        Assertions.assertFalse(result);
    }

    @Test
    void IsOnePersonPossible() {
        Integer numberOfCelebrities = 1;
        Integer numberOf5PersonVehicles = 5;
        Integer numberOf1PersonVehicles = 1;

        Boolean result = transerCelebrities.transport(numberOfCelebrities, numberOf5PersonVehicles, numberOf1PersonVehicles);

        Assertions.assertTrue(result);
    }
}