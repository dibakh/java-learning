package challenge.raiCipher;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class DownStrategyTest {

    private DownStrategy downStrategy = new DownStrategy(3);

    @Test
    void getNext() {
        Coordinate coordinate = new Coordinate(0, 0);

        Optional<Coordinate> result = downStrategy.getNext(coordinate);

        Coordinate expected = new Coordinate(1, 1);
        assertEquals(expected, result.get());
    }

    @Test
    void getNextOutOfBounds() {
        Coordinate coordinate = new Coordinate(2, 2);

        Optional<Coordinate> result = downStrategy.getNext(coordinate);

        assertFalse(result.isPresent());
    }
}