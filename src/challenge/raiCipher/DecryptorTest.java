package challenge.raiCipher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DecryptorTest {

    private Decryptor decryptor = new Decryptor();

    @Test
    void decrypt() {
        String actual = decryptor.getDecryptCoordinates("HMALAOADBPUSHRSIAA", 3);

        String expected = "HOSAMDIBAPAULSAHAR";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decryptBest() {
        String actual = decryptor.getDecryptCoordinates("bpreiaetrgamrvensomsn", 3);

        String expected = "bestprogrammersvienna";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decryptWithSpaces() {
        String actual = decryptor.getDecryptCoordinates(" MALAOAD PUSH SIAA", 3);

        String expected = " OSAMDI APAULSAHA ";
        Assertions.assertEquals(expected, actual);
    }
//    private List<Coordinate> getCoordinates() {
//        return Arrays.asList(
//                new Coordinate(0, 0),
//                new Coordinate(1, 1),
//                new Coordinate(2, 2),
//                new Coordinate(3, 1),
//                new Coordinate(4, 0),
//                new Coordinate(5, 1),
//                new Coordinate(6, 2),
//                new Coordinate(7, 1),
//                new Coordinate(8, 0),
//                new Coordinate(9, 1),
//                new Coordinate(10, 2),
//                new Coordinate(11, 1),
//                new Coordinate(12, 0),
//                new Coordinate(13, 1),
//                new Coordinate(14, 2),
//                new Coordinate(15, 1),
//                new Coordinate(16, 0),
//                new Coordinate(17, 1)
//        );
}