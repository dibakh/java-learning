package challenge.raiCipher;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CipherMap {

    public String Encrypt(List<Coordinate> cipherCoordinate, String plainText) {
        Map<Coordinate, String> coordinateStringMap = makeCipherMap(cipherCoordinate, plainText);
        return  coordinateStringMap.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getKey().getColumn()))
                .sorted(Comparator.comparingInt(e -> e.getKey().getRow()))
                .map(e -> e.getValue())
                .collect(joining());
    }

    public Map<Coordinate, String> makeCipherMap(List<Coordinate> cipherCoordinates, String text) {
        Map<Coordinate, String> cipherMap = new HashMap<>();
        List<String> characterList = getList(text);
        for (Coordinate coordinate : cipherCoordinates) {
            cipherMap.put(coordinate, characterList.get(0));
            characterList.remove(0);
        }
        return cipherMap;
    }


    private List<String> getList(String plainText) {
        return Stream.of(plainText.split(""))
                .collect(toList());
    }
}
