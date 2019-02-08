package challenge.unblockMeChallange.coordinate;

import challenge.raiCipher.Coordinate;
import challenge.unblockMeChallange.block.Block;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CoordinateGetterTest {
    private CoordinateGetter coordinateGetter = new CoordinateGetter();

    @Test
    void getCoordinates() {
        Block block1 = new Block(0, "v", 1, 4, 5);
        Block block2 = new Block(1, "h", 4, 1, 2);
        Queue<Block> blocks=new LinkedList<>();
        blocks.addAll(Arrays.asList(block1, block2));

        List<Coordinate> result = coordinateGetter.getCoordinates(blocks);
//        for (Coordinate coordinate : result) {
//            System.out.println(coordinate.getColumn()+ " | "+ coordinate.getRow());
//
//        }
        Assertions.assertEquals(7,result.size());
    }
}