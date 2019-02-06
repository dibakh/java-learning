package challenge.raiCipher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RailCipherTest {

    @Test
    void getCoordinates() {
        List<Coordinate> actual = new RailCipher("HOSAMDIBAPAUL").getCoordinates(3);
        List<Coordinate> expected = getExpectedCoordinates();
        Assertions.assertEquals(expected, actual);
    }

    private List<Coordinate> getExpectedCoordinates() {
        return Arrays.asList(new Coordinate(0, 0),
                new Coordinate(1, 1),
                new Coordinate(2, 2),
                new Coordinate(3, 1),
                new Coordinate(4, 0),
                new Coordinate(5, 1),
                new Coordinate(6, 2),
                new Coordinate(7, 1),
                new Coordinate(8, 0),
                new Coordinate(9, 1),
                new Coordinate(10, 2),
                new Coordinate(11, 1),
                new Coordinate(12, 0)
        );
    }
}