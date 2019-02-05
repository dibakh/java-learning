package challenge.raiCipher;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CipherMapTest {

    private CipherMap cipherMap = new CipherMap();
    @Test
    void encryptProper(){
        String plainText = "HOSAMDIBAPAUL";
        List<Coordinate> coordinates = new RailCipher(plainText).getCoordinates(3);
        Map<Coordinate, String> map = cipherMap.makeCipherMap(coordinates, plainText);
        for (Map.Entry<Coordinate, String> coordinateStringEntry : map.entrySet()) {
            System.out.println(("column: " + coordinateStringEntry.getKey().getColumn()
                    + " |  Row: " + coordinateStringEntry.getKey().getRow())
                    + " |  Character: " + coordinateStringEntry.getValue());
            }
        }

    @Test
    void encrypt() {
        CipherMap cipherMap = new CipherMap();
        List<Coordinate> coordinateList = new RailCipher("HOSAMDIBAPAULSAHAR").getCoordinates(3);

        String actual = (String) cipherMap.Encrypt(coordinateList, "HOSAMDIBAPAULSAHAR");
        String expected = "HMALAOADBPUSHRSIAA";

        assertEquals(expected, actual);
    }

    @Test
    void encrypt4Rails() {
        CipherMap cipherMap = new CipherMap();
        List<Coordinate> coordinateList = new RailCipher("HOSAMDIBAPAUL").getCoordinates(4);

        String actual = (String) cipherMap.Encrypt(coordinateList, "HOSAMDIBAPAUL");
        String expected = "HILODBUSM AAAP";

        assertEquals(expected, actual);
    }

    @Test
    void encryptWithSpaces() {
        CipherMap cipherMap = new CipherMap();
        List<Coordinate> coordinateList = new RailCipher("HMALAOADBPUSHRSIAA").getCoordinates(3);

        String actual = (String) cipherMap.Encrypt(coordinateList, " OSAMDI APAULSAHA ");
        String expected = " MALAOAD PUSH SIAA";

        assertEquals(expected, actual);
    }


    @Test
    void decrypt() {
        CipherMap cipherMap = new CipherMap();
        List<Coordinate> coordinateList = new RailCipher("HMALAOADBPUSHRSIAA").getCoordinates(3); /*getCoordinates()*/;

        String actual = (String) cipherMap.Encrypt(coordinateList, "HMALAOADBPUSHRSIAA");
        String expected = "HOSAMDIBAPAULSAHAR";

        assertEquals(expected, actual);
    }
}
