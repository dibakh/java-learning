package challenge.timeToWord;

import java.util.Map;

public class OClock implements Time {
    private Map<Integer, String> numbers = Numbers.getNumbersAndWords();

    @Override
    public Boolean isInRange(Integer minute) {

        return minute.equals(0);
    }

    @Override
    public String getHourInWord(Integer hour, Integer minute) {
        if (hour.equals(0) || hour.equals(24)) {
            return "";
        }
        return numbers.get(hour)+" O'Clock!";
    }
}
