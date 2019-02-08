package challenge.unblockMeChallange.coordinate;


import challenge.raiCipher.Coordinate;
import challenge.unblockMeChallange.coordinate.strategy.DirectionStrategy;
import challenge.unblockMeChallange.coordinate.strategy.Strategies;
import challenge.unblockMeChallange.block.Block;

import java.util.*;

import static java.util.stream.Collectors.*;

public class CoordinateGetter {

    private List<DirectionStrategy> strategies = Strategies.asList();

    public List<Coordinate> getCoordinates(Queue<Block> blocks) {
        return blocks.stream()
                .map(this::toCoordinates)
                .flatMap(List::stream)
                .collect(toList());
    }

    private List<Coordinate> toCoordinates(Block block) {
        return strategies.stream()
                .map(e -> e.getCoordinates(block))
                .filter(e -> !e.isEmpty())
                .flatMap(List::stream)
                .collect(toList());

//        if (block.getDirection().equalsIgnoreCase("h")) {
//            return strategies.get(0).getCoordinates(block);
//        }
//        return strategies.get(1).getCoordinates(block);
    }
}
