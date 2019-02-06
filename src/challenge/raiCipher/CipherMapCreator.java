package challenge.raiCipher;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CipherMapCreator {


    public static Map<Coordinate, String> makeCipherMap(List<Coordinate> coordinates, String text) {
        Map<Coordinate, String> cipherMap = new HashMap<>();
        Queue<String> letters = toLetters(text);
        for (Coordinate coordinate : coordinates) {
            cipherMap.put(coordinate, letters.poll());
        }
        return cipherMap;
    }

    private static Queue<String> toLetters(String plainText) {
        List<String> list = Stream.of(plainText.split(""))
                .collect(Collectors.toList());
        return new LinkedList<>(list);
    }
}