package exercises.week07.ex06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SecretHandshakeMovesTranslatorTest {

    @Test
    void translatePrice() {
        SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();

        Integer price=195;
        List<String> expect= Arrays.asList("thousand knuckles", "tickles over palm");

        List<String> answer = translator.translatePrice(price);
        Assertions.assertEquals(expect,answer);
    }

    @Test
    void translateallNumbers() {
        SecretHandshakeMovesTranslator translator = new SecretHandshakeMovesTranslator();

        Integer price=6259;
        List<String> expect= Arrays.asList("bro knock", "thumb touches back","tickles over palm","thousand knuckles");

        List<String> answer = translator.translatePrice(price);
        Assertions.assertEquals(expect,answer);
    }
}