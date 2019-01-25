package reflection.week10;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AliceSummarizer {
    private List<String> lines = new AliceReader().getLine();

    public long getNumberOfWords() {
        return lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .count();
    }

    public long getNumberOfDistinctWord() {
        return lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .distinct()
                .count();

    }

    public Optional<String> getLongestWords() {
        return lines.stream()
                .map(e->e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .map(e -> e.getKey() + " " + e.getValue())
                .findFirst();
    }

    public List<Map.Entry<String, Long>> get5MostAppearingWord() {
        return lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .collect(Collectors.toList());
    }

    public List<Map.Entry<String, Long>> get5MostAppearingLetter() {
        return lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .collect(Collectors.toList());
    }

    public long getHowManyTimesAliceAppears() {
        return lines.stream()
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .map(e -> "alice".equalsIgnoreCase(e))
                .count();
    }
}

