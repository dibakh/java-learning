package challenge.raiCipher;

import challenge.railFenceCipher.Up;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class UpStrategyTest {

    private UpStrategy upStrategy = new UpStrategy(3);

    @Test
    void getNext() {
        Coordinate coordinate = new Coordinate(2, 2);

        Optional<Coordinate> result = upStrategy.getNext(coordinate);

        Coordinate expected = new Coordinate(3, 1);
        assertEquals(expected, result.get());
    }

    @Test
    void getOutOfBounds() {
        Coordinate coordinate = new Coordinate(4, 0);

        Optional<Coordinate> result = upStrategy.getNext(coordinate);

        assertFalse(result.isPresent());
    }
}