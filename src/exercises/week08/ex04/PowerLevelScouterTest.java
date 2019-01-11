package exercises.week08.ex04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerLevelScouterTest {
    private String name = "Susana";
    private PowerLevelScouter powerLevelScouter = new PowerLevelScouter ( );

    @Test
    void scout() {
        Integer answer = powerLevelScouter.scout (name);
        Integer expected = 368;

        Assertions.assertEquals (expected, answer);
    }

    @Test
    void scoutEnhanced() {
        Integer answer = powerLevelScouter.scoutEnhanced (name);
        Integer expected = 400;

        Assertions.assertEquals (expected, answer);
    }
}