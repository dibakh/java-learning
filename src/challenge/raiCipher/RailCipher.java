package challenge.raiCipher;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RailCipher {

    private String text;

    public RailCipher(String text) {

        this.text = text;
    }

    public List<Coordinate> getCoordinates(Integer numberOfRow) {
        List<Strategy> strategies = getStrategies(numberOfRow);
        List<Coordinate> coordinates = new ArrayList<>();

        Coordinate coordinate = new Coordinate(0,0);
        coordinates.add(coordinate);

        while (coordinates.size() <= text.length() -1) {
            Optional<Coordinate> next = strategies.get(0).getNext(coordinate);
            if (!next.isPresent()) {
                Collections.rotate(strategies, 1);
            } else {
                Coordinate newCoordinate = next.get();
                coordinates.add(newCoordinate);
                coordinate = newCoordinate;
            }
        }
        return coordinates;
    }

    private List<Strategy> getStrategies(Integer numberOfRow) {
        return Stream.of(
                new DownStrategy(numberOfRow),
                new UpStrategy(numberOfRow))
                .collect(Collectors.toList());
    }
}
