package exercises.week11.ex03;

import java.util.Map;

public class MinAfter30 implements Time {
    private Map<Integer, String> numbers = Numbers.getNumbersAndWords();

    @Override
    public Boolean isInRange(Integer minute) {

        return minute > 30;
    }

    @Override
    public String getHourInWord(Integer hour, Integer minute) {
        return numbers.get(60-minute) + " to " + numbers.get(hour+1);
    }
}
