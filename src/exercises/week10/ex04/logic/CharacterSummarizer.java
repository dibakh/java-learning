package exercises.week10.ex04.logic;

import exercises.week10.ex04.model.Character;
import exercises.week10.ex04.parser.CharacterParser;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CharacterSummarizer {
    List<Character> lines = new CharacterParser().getLines();

    public long getTotalCharInBook() {
        return lines.stream()
                .count();
    }

    public long getNumberOfDeadChar() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .count();
    }

    public String getPercantageOfDeathManAndWoman(long numberOfDeath) {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .map(Character::getGender)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> e.getKey()
                        .replace("0", "famale")
                        .replace("1", "male")
                        + "\t" + (e.getValue() * 100) / numberOfDeath + "%")
                .collect(Collectors.joining("\n"));
    }

    public Optional<Map.Entry<String, Long>> getBookWithMostdeadFromStarkAllegiance() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> "Stark".equals(e.getAllegiances()))
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();
    }

    public String getTwoAllegiancesWithHighestDead() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getAllegiances(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(2)
                .map(e -> e.getKey() + " " + e.getValue())
                .collect(Collectors.joining("\n"));
    }

    public String getWhoIsDeadInBookOfHighestDead(String key) {
        return lines.stream()
                .filter(e -> e.getBookOfDeath().equals(key))
                .map(e -> e.getName())
                .collect(Collectors.joining("\n "));
    }

    public Optional<Map.Entry<String, Long>> getBookWithHighestDeath() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .collect(Collectors.groupingBy(e -> e.getBookOfDeath(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();
    }

    public Optional<Map.Entry<String, Long>> getBookWhichHasMostDeadFromLannister() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> "Lannister".equals(e.getAllegiances()))
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .findFirst();
    }

    public String getPercantageOfNobilityChar() {
        long numberOfNobilityChar = lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> "1".equals(e.getNobility()))
                .count();
        long totalDeadChar = getNumberOfDeadChar();
        return (numberOfNobilityChar * 100) / totalDeadChar + "%";
    }

    public long getNumberOfDeadStark() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> "Stark".equals(e.getAllegiances()))
                .count();
    }

    public long getNumberOfDeadLannisters() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .filter(e -> "Lannister".equals(e.getAllegiances()))
                .count();
    }

    public Boolean isThereAnyAliveChar() {
        return lines.stream()
                .anyMatch(e -> e.getDeathYear().isEmpty());
    }

    public Boolean isThereAnyIntroducedAndDeadInSameChapter() {
        return lines.stream()
                .filter(e -> !e.getDeathYear().isEmpty())
                .anyMatch(e -> e.getBookIntroChapter().equals(e.getDeathChapter()));
    }
}
