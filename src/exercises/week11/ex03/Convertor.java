package exercises.week11.ex03;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convertor {
    private Map<Integer, String> numbersAndWords = Numbers.getNumbersAndWords();
    private List<Time> times = Times.getTimes();
    private List<Moment> moments = Moments.getMoment();

    public String toWords(Integer hour, Integer minute) {
    return times.stream()
            .filter(e -> e.isInRange(minute))
            .map(e -> e.getHourInWord(hour,minute))
            .limit(1)
            .collect(Collectors.joining());
    }

    public String toMoment(Integer hour, Integer minute) {
        LocalTime currentTime = LocalTime.of(hour, minute);
        return moments.stream()
                .filter(e -> e.isBetween(currentTime))
                .map(Moment::getMoment)
                .limit(1)
                .collect(Collectors.joining());
    }

    private String getOclock(Integer hour) {
//        if (hour.equals(0)) {
//            return "It's midnight!";
//        }

        return Number.toString(hour) + " O'CLOCK!";
    }
}
