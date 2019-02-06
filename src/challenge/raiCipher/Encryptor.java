package challenge.raiCipher;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.joining;

public class Encryptor {

    public String Encrypt(List<Coordinate> cipherCoordinate, String plainText) {
        Map<Coordinate, String> coordinateStringMap = CipherMapCreator.makeCipherMap(cipherCoordinate, plainText);
        return coordinateStringMap.entrySet().stream()
                .sorted(comparingInt(e -> e.getKey().getColumn()))
                .sorted(comparingInt(e -> e.getKey().getRow()))
                .map(Map.Entry::getValue)
                .collect(joining());
    }
}