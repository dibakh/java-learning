package challenge.raiCipher;

import java.util.Optional;

public class UpStrategy implements Strategy {
    private Integer numberOfRow;

    public UpStrategy(Integer numberOfRow) {
        this.numberOfRow = numberOfRow;
    }

    @Override
    public Optional<Coordinate> getNext(Coordinate last) {
        Integer column = last.getColumn();
        Integer row = last.getRow();
        if (row <= 0) {
            return Optional.empty();
        }
        return Optional.of(new Coordinate(column + 1, row - 1));
    }
}