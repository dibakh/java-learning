package exercises.week08.ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PowerLevelScouter {


    public Integer scout(String name) {
        Integer powerLevel = calculateAsciiCode (name, n -> ( int ) n.charAt (0));
        return powerLevel;

    }

    public Integer scoutEnhanced(String name) {
        Integer powerLevel = calculateAsciiCode (name, n -> ( int ) n.toLowerCase ( ).charAt (0));
        return powerLevel;
    }

    private Integer calculateAsciiCode(String name, Function<String, Integer> formul) {
        Integer powerLevel = new Integer (0);
        List<String> letters = Arrays.asList (name.split (""));
        for ( String letter : letters ) {
            powerLevel += formul.apply (letter);
        }
        return powerLevel;
    }
}
