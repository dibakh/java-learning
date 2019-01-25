package reflection.week10;


import exercises.week09.ex05.FilmReader;

import java.util.List;
import java.util.stream.Collectors;

public class AliceReader {
    public List<String> getLine(){
        return new FileReader().asStream("reflection/week10/alice.txt")
                .map(String::toLowerCase)
                .map(e->e.replaceAll(","," "))
                .map(e->e.replaceAll(";"," "))
                .map(e->e.replaceAll("’s"," "))
                .map(e->e.replaceAll("’"," "))
                .map(e->e.replaceAll("‘"," "))
                .map(e->e.replaceAll(":"," "))
                .map(e->e.replaceAll("#"," "))
                .map(e->e.replaceAll("/"," "))
                .map(e->e.replaceAll("-"," "))
                .map(e->e.replaceAll(" \\."," "))
                .map(e->e.replaceAll(" \\*"," "))
                .map(e->e.replaceAll(" \\("," "))
                .map(e->e.replaceAll(" \\)"," "))
                .map(e->e.replaceAll(" \\["," "))
                .map(e->e.replaceAll(" \\]"," "))
                .collect(Collectors.toList());
    }
}