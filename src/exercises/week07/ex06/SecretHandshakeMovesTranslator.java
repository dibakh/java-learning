package exercises.week07.ex06;

import exercises.week07.ex04.NumberSplitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretHandshakeMovesTranslator {

    private List<String> secretMoves = new ArrayList<>();

    public List<String> translatePrice(Integer price) {

        NumberSplitter numberSplitter = new NumberSplitter();

        List<Integer> digitsOfPrice = numberSplitter.splitNumber(price);

        defineMoves(digitsOfPrice);

        return secretMoves;
    }

    private List<String> defineMoves(List<Integer> digitsOfPrice) {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 9);
        List<String> moves = Arrays.asList(
                "thumb touches back",
                "tickles over palm",
                "bro knock",
                "thousand knuckles"
        );

        for (Integer digit : digitsOfPrice) {
            if (numbers.contains(digit)) {
                int position = numbers.indexOf(digit);
                String movement = moves.get(position);
                secretMoves.add(movement);
            }
        }

        return secretMoves;
    }
}
