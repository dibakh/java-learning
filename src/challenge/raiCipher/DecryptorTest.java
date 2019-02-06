package challenge.raiCipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptorTest {

    private Decryptor decryptor = new Decryptor();

    @Test
    void decrypt() {
        String actual = decryptor.getDecryptCoordinates("HMALAOADBPUSHRSIAA", 3);

        String expected = "HOSAMDIBAPAULSAHAR";
        assertEquals(expected, actual);
    }

    @Test
    void decryptBest() {
        String actual = decryptor.getDecryptCoordinates("bpreiaetrgamrvensomsn", 3);

        String expected = "bestprogrammersvienna";
        assertEquals(expected, actual);
    }

    @Test
    void decryptWithSpaces() {
        String actual = decryptor.getDecryptCoordinates(" MALAOAD PUSH SIAA", 3);

        String expected = " OSAMDI APAULSAHA ";
        assertEquals(expected, actual);
    }
}