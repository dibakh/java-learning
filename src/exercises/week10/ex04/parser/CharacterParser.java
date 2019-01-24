package exercises.week10.ex04.parser;

import exercises.week09.ex02.FileReader;
import exercises.week10.ex04.model.Character;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterParser {
    public List<Character> getLines() {
        return new FileReader().asStream("exercises/week10/ex04/resource/got-characters.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Character(
                        e[0],
                        e[1],
                        e[2],
                        e[3],
                        e[4],
                        e[5],
                        e[6],
                        e[7]
                ))
                .collect(Collectors.toList());
    }
}
