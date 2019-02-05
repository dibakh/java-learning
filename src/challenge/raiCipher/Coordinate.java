package challenge.raiCipher;

import java.util.Objects;

public class Coordinate {
    Integer column;
    Integer row;

    public Coordinate(Integer column, Integer row) {
        this.column = column;
        this.row = row;
    }

    public Integer getColumn() {
        return column;
    }

    public Integer getRow() {
        return row;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return column.equals(that.column) &&
                row.equals(that.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }
}
