package exercises.week11.ex03;

import java.time.LocalTime;

public class Night extends Moment {
//    For hours between 20:01 and 5:59, add at night
    public Night() {
        super(LocalTime.of(20, 01), LocalTime.of(5, 59), "night");
    }
}
