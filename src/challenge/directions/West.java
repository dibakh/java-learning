package challenge.directions;

import java.util.Objects;

public class West implements Direction {
    private String name = "west";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "east".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "West";
    }

}
