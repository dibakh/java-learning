package challenge.raiCipher;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RailCipher {

    private String text;
    private Coordinate coordinate = new Coordinate(0, 0);

    public RailCipher(String text) {

        this.text = text;
    }

    public List<Coordinate> getCoordinates(Integer numberOfRow) {
        List<Strategy> strategies = getStrategies(numberOfRow);
        List<Coordinate> coordinates = getCoordinates();
        while (areThereLetters(coordinates)) {
            addNextCoordinate(strategies, coordinates);
        }
        return coordinates;
    }

    private List<Strategy> getStrategies(Integer numberOfRow) {
        return Stream.of(
                new DownStrategy(numberOfRow),
                new UpStrategy(numberOfRow))
                .collect(Collectors.toList());
    }

    private List<Coordinate> getCoordinates() {
        return Stream.of(coordinate).collect(Collectors.toList());
    }

    private boolean areThereLetters(List<Coordinate> coordinates) {
        return coordinates.size() <= text.length() - 1;
    }

    private void addNextCoordinate(List<Strategy> strategies, List<Coordinate> coordinates) {
        Optional<Coordinate> next = strategies.get(0).getNext(coordinate);
        if (!next.isPresent()) {
            Collections.rotate(strategies, 1);
        } else {
            Coordinate newCoordinate = next.get();
            coordinates.add(newCoordinate);
            coordinate = newCoordinate;
        }
    }
}