package challenge.unblockMeChallange;

import challenge.raiCipher.Coordinate;
import challenge.unblockMeChallange.block.Block;
import challenge.unblockMeChallange.block.BlockMaker;
import challenge.unblockMeChallange.coordinate.CoordinateGetter;

import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public class OverlapChecker {

    boolean isOverlapping(String information) {
        Queue<Block> blocks = new BlockMaker().create(information);
        List<Coordinate> coordinates = new CoordinateGetter().getCoordinates(blocks);
        return dibaLogic(coordinates); // diabolic
    }

    private boolean dibaLogic(List<Coordinate> coordinates) {
        return coordinates.size() != new HashSet<>(coordinates).size();
    }
}
