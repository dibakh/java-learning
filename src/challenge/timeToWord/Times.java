package challenge.timeToWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Times {
    public static List<Time> getTimes(){
        return new ArrayList<>(Arrays.asList(
                new OClock(),
                new MinBeforeAndEqual30(),
                new MinAfter30()
        ));
    }
}
