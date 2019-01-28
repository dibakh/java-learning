package challenge.directions;

import java.util.Objects;

public class North implements Direction {
    private String name = "north";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "south".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "North";
    }

}
