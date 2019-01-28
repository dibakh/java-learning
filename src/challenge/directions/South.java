package challenge.directions;

import java.util.Objects;

public class South implements Direction {

    private String name = "south";

    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean defeats(Direction direction) {

        return "north".equalsIgnoreCase(direction.getName());
    }

    @Override
    public String toString() {

        return "South";
    }

}
