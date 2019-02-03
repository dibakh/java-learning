package challenge.timeToWord;

import java.time.LocalTime;

public class Afternoon extends Moment {
    //    For hours between 12:01 and 17:00, add in the afternoon
    public Afternoon() {

        super(LocalTime.of(12, 01), LocalTime.of(17, 00), "afternoon");
    }
}
