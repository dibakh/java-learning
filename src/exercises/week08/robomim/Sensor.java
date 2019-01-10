package exercises.week08.robomim;

import java.util.List;
import java.util.Optional;

public class Sensor {
    public Optional<String> getDecriptedTrick(String line) {
        List<Decryptor> decriptores = Decryptors.getDecryptors();
        for (Decryptor decriptore : decriptores) {
            if (decriptore.isThere(line)) {
                return Optional.of(decriptore.decriptor(line));
            }
        }
        return Optional.empty();
    }
}
