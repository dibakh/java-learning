package challenge.raiCipher;

import java.util.Optional;

public interface Strategy {

    Optional<Coordinate> getNext(Coordinate last);

}
