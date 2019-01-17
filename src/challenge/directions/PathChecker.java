package challenge.directions;

import java.util.List;

public class PathChecker {
    public List<Direction> dirReduc(List<Direction> directionsList) {

        int listSize = directionsList.size();
        int position = 0;

        while (position < listSize - 1) {
            Direction direction1 = directionsList.get(position);
            Direction direction2 = directionsList.get(position + 1);


            if (areSameDirections(direction1, direction2)) {
                directionsList.remove(position);
            }

            if (direction1.defeats(direction2)) {
                directionsList = removeBothDirections(directionsList, position);
                if (position != 0) {
                    position--;
                }
            } else {
                position++;
            }

            listSize = directionsList.size();
        }

        return directionsList;
    }

    private List<Direction> removeBothDirections(List<Direction> directionsList, int position) {
        directionsList.remove(position);
        directionsList.remove(position);
        return directionsList;
    }

    private boolean areSameDirections(Direction direction1, Direction direction2) {
        return direction1.equals(direction2);
    }
}
