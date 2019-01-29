package exercises.week11.ex02;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Convert {
    public String toMilitaryTime(String timeFromat12Hour) {
        LocalTime currentTime = LocalTime.parse(timeFromat12Hour, DateTimeFormatter.ofPattern("hh:mm:ss a"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        return currentTime.format(dateTimeFormatter);
    }
}
