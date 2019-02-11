package exercises.week07.ex09;


import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoryFileReader {
    public Set<String> getLine() {
        return new FileReader().asStream("exercises/week07/ex09/book/alice's-adventures-in-wonderland.txt")
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",", " "))
//                .map(e -> e.replaceAll("’s", " "))
//                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("!", " "))
                .map(e -> e.replaceAll("\\?", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll("‘", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.replaceAll("\\“", " "))
                .map(e -> e.replaceAll("\\”", " "))
                .map(e -> e.replaceAll("\\]", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .collect(Collectors.toSet());

    }
}
