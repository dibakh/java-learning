package challenge.unblockMeChallange.block;

import challenge.raiCipher.Coordinate;

import java.util.List;
import java.util.Objects;

public class Block {

    private Integer id;
    private String direction;
    private Integer startColumn;
    private Integer startRow;
    private Integer length;
    private List<Coordinate> coordinates;

    public Block(Integer id, String direction, Integer startColumn, Integer startRow, Integer length) {
        this.id = id;
        this.direction = direction;
        this.startColumn = startColumn;
        this.startRow = startRow;
        this.length = length;
        // prepare the coordinates here
    }

    public Integer getId() {
        return id;
    }

    public String getDirection() {
        return direction;
    }

    public Integer getStartColumn() {
        return startColumn;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public Integer getLength() {
        return length;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return id.equals(block.id) &&
                direction.equals(block.direction) &&
                startColumn.equals(block.startColumn) &&
                startRow.equals(block.startRow) &&
                length.equals(block.length) &&
                coordinates.equals(block.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, direction, startColumn, startRow, length, coordinates);
    }

}

