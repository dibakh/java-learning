package exercises.week04.ex12.ex033333.ex03;

import exercises.week09.ex03.Caesar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {
    private exercises.week09.ex03.Caesar caesar = new Caesar();

    @Test
    void testEncrypt() {
        String message = "be sure to drink your Ovaltine";
        String encryptedMessage = caesar.encrypt(message, 13);
        String expected = "or fher gb qevax lbhe Binygvar";
        Assertions.assertEquals(expected, encryptedMessage);
    }
}