package challenge.timeToWord;

import java.time.LocalTime;

public class Midnight extends Moment {
    //    At 24 o’clock, replace the whole message by midnight
    public Midnight() {

        super(LocalTime.of(0, 0), LocalTime.of(0, 0), "midnight");
    }
}
