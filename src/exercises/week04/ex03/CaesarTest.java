package exercises.week04.ex12.ex03;

import exercises.week09.ex03.Caesar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {
    private exercises.week09.ex03.Caesar caesar = new Caesar();
    @Test
    void allBigLettersThroughStream(){
        String result = caesar.cipher("HELLO", 1);
        String expected = "IFMMP";
        Assertions.assertEquals(expected,result);
    }

    @Test
    void allSmallWithSymbolThroughStream(){
        String result = caesar.cipher("hello, world", 13);
        String expected = "uryyb, jbeyq";
        Assertions.assertEquals(expected,result);
    }

    @Test
    void testEncryptThroughStream() {
        String message = "be sure to drink your Ovaltine";
        String encryptedMessage = caesar.cipher(message, 13);
        String expected = "or fher gb qevax lbhe Binygvar";
        Assertions.assertEquals(expected, encryptedMessage);
    }

}