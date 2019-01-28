package challenge.directions;

import java.util.Objects;

public class East implements Direction {
    private String name = "east";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "west".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "East";
    }

}
