package challenge.raiCipher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RailCipherTest {

    @Test
    void getCoordinates() {
        List<Coordinate> listOfCoordinate = new
                RailCipher("HOSAMDIBAPAUL").getCoordinates(3);
        for (Coordinate coordinate : listOfCoordinate) {
            System.out.println("column: " + coordinate.getColumn()
                    + " |  Row: " + coordinate.getRow());
        }

        List<Coordinate> expected = Arrays.asList(new Coordinate(0, 0),
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
                new Coordinate(12, 0),
                new Coordinate(13, 1)
        );

        Assertions.assertEquals(expected, listOfCoordinate);
    }
}