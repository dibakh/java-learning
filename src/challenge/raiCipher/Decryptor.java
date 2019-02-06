package challenge.raiCipher;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Decryptor {

    public String getDecryptCoordinates(String cipheredText, Integer numRails) {
        List<Coordinate> decryptCoordinates = new RailCipher(cipheredText).getCoordinates(numRails);
        decryptCoordinates = decryptCoordinates.stream()
                .sorted(Comparator.comparingInt(Coordinate::getRow))
                .collect(toList());
        Map<Coordinate, String> decryptMap = CipherMapCreator.makeCipherMap(decryptCoordinates, cipheredText);

        return decryptMap.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getKey().getColumn()))
                .map(Map.Entry::getValue)
                .collect(joining());
    }
}