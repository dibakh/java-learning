package exercises.week11.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertorTest {
    Convertor convert = new Convertor();

    @Test
    void testOClock() {
        String result = convert.toWords(12, 0) + " "
                + convert.toMoment(12, 0);
        Assertions.assertEquals("twelve O'CLOCK! noon", result);
    }

    @Test
    void testMidnight() {
        String result = convert.toWords(00, 00) + " "
                + convert.toMoment(00, 00);
        Assertions.assertEquals("It's midnight! midnight", result);
    }

    @Test
    void testHalfPast() {
        String result = convert.toWords(13, 30) + " "
                + convert.toMoment(13, 30);
        Assertions.assertEquals("half past thirteen afternoon", result);
    }

    @Test
    void testMinToHour() {
        String result = convert.toWords(13, 40) + " "
                + convert.toMoment(13, 40);
        Assertions.assertEquals("twenty to fourteen afternoon", result);
    }

    @Test
    void testMinPastHour() {
        String result = convert.toWords(13, 12) + " "
                + convert.toMoment(13, 12);
        System.out.println(result);
        Assertions.assertEquals("twelve past thirteen afternoon", result);
    }
}