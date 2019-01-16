package challenge.directions;

public class decisionMaker {
    public Boolean checkPath(Direction direction1, Direction direction2) {
        if (areDefeatingEachOther(direction1, direction2)) {
            return true;
        }
        return false;
    }

    private boolean areDefeatingEachOther(Direction direction1, Direction direction2) {
        return direction1.defeats(direction2);
    }
}
