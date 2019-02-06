package challenge.raiCipher;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptorTest {
    private Encryptor encryptor = new Encryptor();

    @Test
    void encryptTest() {
        List<Coordinate> coordinateList = new RailCipher("HOSAMDIBAPAULSAHAR").getCoordinates(3);

        String actual = encryptor.Encrypt(coordinateList, "HOSAMDIBAPAULSAHAR");
        String expected = "HMALAOADBPUSHRSIAA";

        assertEquals(expected, actual);
    }

    @Test
    void encrypt4RailsTest() {
        List<Coordinate> coordinateList = new RailCipher("HOSAMDIBAPAUL").getCoordinates(4);

        String actual = encryptor.Encrypt(coordinateList, "HOSAMDIBAPAUL");
        String expected = "HILODBUSMAAAP";

        assertEquals(expected, actual);
    }

    @Test
    void encryptWithSpaces() {
        List<Coordinate> coordinateList = new RailCipher("HMALAOADBPUSHRSIAA").getCoordinates(3);

        String actual = encryptor.Encrypt(coordinateList, " OSAMDI APAULSAHA ");
        String expected = " MALAOAD PUSH SIAA";

        assertEquals(expected, actual);
    }
}