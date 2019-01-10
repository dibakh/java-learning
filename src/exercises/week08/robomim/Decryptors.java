package exercises.week08.robomim;

import java.util.Arrays;
import java.util.List;

public class Decryptors {

    private static List<Decryptor> decryptors = Arrays.asList(
            new ExclamationDecryptor(), new AmpersandDecryptor(), new HashtagDecryptor());

    public static List<Decryptor> getDecryptors() {
        return decryptors;
    }


}
