package exercises.week07.ex09;

import exercises.week07.ex09.FileReader;
import java.util.List;
import java.util.stream.Collectors;

public class DictionaryFileReader {
    public List<String> getLine(){
        return new FileReader().asStream("exercises/week07/ex09/word/words.txt")
                .map(String::toLowerCase)
                .collect(Collectors.toList());

    }
}
