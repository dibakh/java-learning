package exercises.week11.ex03;

import java.util.Map;

public class MinBeforeAndEqual30 implements Time {
    private Map<Integer, String> numbers = Numbers.getNumbersAndWords();

    @Override
    public Boolean isInRange(Integer minute) {

        return minute > 0 && minute < 31;
    }

    @Override
    public String getHourInWord(Integer hour, Integer minute) {
        return numbers.get(minute) + " past " + numbers.get(hour);
    }
}
