package challenge.raiCipher;

import java.util.Optional;

public class DownStrategy implements Strategy {

    private Integer numberOfRow;

    public DownStrategy(Integer numberOfRow) {

        this.numberOfRow = numberOfRow;
    }

    @Override
    public Optional<Coordinate> getNext(Coordinate coordinate) {
        Integer row = coordinate.getRow();
        Integer column = coordinate.getColumn();
        if (row >= numberOfRow - 1) {
            return Optional.empty();
        }
        return Optional.of(new Coordinate(column + 1, row + 1));
    }
}