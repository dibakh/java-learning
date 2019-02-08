package challenge.unblockMeChallange.coordinate.strategy;

import java.util.Arrays;
import java.util.List;

public class Strategies {

    private static List<DirectionStrategy> strategies = Arrays.asList(new HorizontalStrategy(), new VerticalStrategy());

    public static List<DirectionStrategy> asList(){
        return strategies;
    }
}
