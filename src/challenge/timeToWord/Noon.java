package challenge.timeToWord;

import java.time.LocalTime;

public class Noon extends Moment {
    //    At 12 o’clock, replace the whole message by noon
    public Noon() {

        super(LocalTime.of(12, 00), LocalTime.of(12, 00), "noon");
    }
}
