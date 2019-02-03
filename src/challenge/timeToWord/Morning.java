package challenge.timeToWord;

import java.time.LocalTime;

public class Morning extends Moment {
    //    For hours between 6:00 and 11:59, say in the morning
    public Morning() {

        super(LocalTime.of(6, 00), LocalTime.of(6, 00), "morning");
    }
}
