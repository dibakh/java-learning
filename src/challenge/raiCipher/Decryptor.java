package challenge.raiCipher;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Decryptor {

    private CipherMap cipherMap = new CipherMap();

    public String getDecryptCoordinates(String cipheredText, Integer numRails) {
        List<Coordinate> decryptCoordinates = new RailCipher(cipheredText).getCoordinates(numRails);
//        change order
        decryptCoordinates = decryptCoordinates.stream()
                .sorted(Comparator.comparingInt(e -> e.getRow()))
//                .sorted(Comparator.comparingInt(e -> e.getColumn()))
                .collect(toList());
        Map<Coordinate, String> decryptMap = cipherMap.makeCipherMap(decryptCoordinates, cipheredText);
        String plainText = decryptMap.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> e.getKey().getColumn()))
                .map(e -> e.getValue())
                .collect(joining());

        return plainText;
    }
}
