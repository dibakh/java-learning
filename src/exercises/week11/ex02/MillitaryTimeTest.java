package exercises.week11.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MillitaryTimeTest {
    Convert convert = new Convert();

    //        Have in mind that midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock.
    @Test
    void testMidnight() {
        String result = convert.toMilitaryTime("12:00:00 AM");
        Assertions.assertEquals("00:00:00", result);
    }

//        Also that noon is 12:00:00 PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

    @Test
    void testNoonHour() {
        String result = convert.toMilitaryTime("12:00:00 PM");
        Assertions.assertEquals("12:00:00", result);
    }

    @Test
    void testMorningHour(){
        String result = convert.toMilitaryTime("07:00:00 AM");
        Assertions.assertEquals("07:00:00", result);
    }

    @Test
    void testAfternoonHour(){
        String result = convert.toMilitaryTime("05:00:00 PM");
        Assertions.assertEquals("17:00:00", result);
    }

}
