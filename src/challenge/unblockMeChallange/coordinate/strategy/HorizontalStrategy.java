package challenge.unblockMeChallange.coordinate.strategy;

import challenge.raiCipher.Coordinate;
import challenge.unblockMeChallange.block.Block;

import java.util.ArrayList;
import java.util.List;

public class HorizontalStrategy implements DirectionStrategy {
    @Override
    public List<Coordinate> getCoordinates(Block block) {
        if (block.getDirection().equalsIgnoreCase("h")) {
            List<Coordinate> coordinates = new ArrayList<>();
            Integer column = block.getStartColumn();
            Integer row = block.getStartRow();
            coordinates.add(new Coordinate(column, row));

            for (int index = 1; index < block.getLength(); index++) {
                column++;
                coordinates.add(new Coordinate(column, row));
            }
            return coordinates;

        }
        return new ArrayList<>();
    }
}
