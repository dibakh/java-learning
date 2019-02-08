package challenge.unblockMeChallange.coordinate.strategy;

import challenge.raiCipher.Coordinate;
import challenge.unblockMeChallange.block.Block;

import java.util.List;

public interface DirectionStrategy {
    List<Coordinate> getCoordinates(Block block);

}
