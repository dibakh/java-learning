package challenge.timeToWord;

public interface Time {
    Boolean isInRange(Integer minute);
    String getHourInWord(Integer hour, Integer minute);
}
