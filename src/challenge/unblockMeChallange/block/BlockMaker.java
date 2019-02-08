package challenge.unblockMeChallange.block;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class BlockMaker {

    public Queue<Block> create(String information) {
        Queue<String> elements = getElements(information);
        return toBlocks(elements);
    }

    private Queue<String> getElements(String information) {
        return Arrays.stream(information.split(" "))
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private Queue<Block> toBlocks(Queue<String> elements) {
        Queue<Block> blocks = new LinkedList<>();
        while (!elements.isEmpty()) {
            Block block = toBlock(elements);
            blocks.offer(block);
        }
        return blocks;
    }

    private Block toBlock(Queue<String> elements) {
        return new Block(
                Integer.valueOf(elements.poll()),
                elements.poll(),
                Integer.valueOf(elements.poll()),
                Integer.valueOf(elements.poll()),
                Integer.valueOf(elements.poll())
        );
    }
}
