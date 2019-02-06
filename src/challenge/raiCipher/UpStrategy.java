package challenge.raiCipher;

import java.util.Optional;

public class UpStrategy implements Strategy {

    public UpStrategy(Integer numberOfRow) {
        Integer numberOfRow1 = numberOfRow;
    }

    @Override
    public Optional<Coordinate> getNext(Coordinate coordinate) {
        Integer column = coordinate.getColumn();
        Integer row = coordinate.getRow();
        if (row <= 0) {
            return Optional.empty();
        }
        return Optional.of(new Coordinate(column + 1, row - 1));
    }
}