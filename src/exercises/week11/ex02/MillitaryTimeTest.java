package exercises.week11.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MillitaryTimeTest {
    Convert convert = new Convert();

    //        Have in mind that midnight is 12:00:00 AM on a 12-hour clock
    @Test
    void toMilitaryTimeExample() {
        String result = convert.toMilitaryTime("12:00:00 AM");
        Assertions.assertEquals("00:00:00", result);
    }
//        and 00:00:00 on a 24-hour clock.

//        Also that noon is 12:00:00 PM on a 12-hour clock,
//        and 12:00:00 on a 24-hour clock.
}
