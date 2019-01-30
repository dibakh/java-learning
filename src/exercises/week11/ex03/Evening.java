package exercises.week11.ex03;

import java.time.LocalTime;

public class Evening extends Moment {
//    For hours between 17:01 and 20:00, add in the evening
    public Evening() {
        super(LocalTime.of(17,01), LocalTime.of(20,0), "evening");
    }
}
