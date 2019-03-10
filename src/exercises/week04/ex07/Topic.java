package Ex07;

public class Topic {

    private String name;
    //         Create the Topic class that has a name.

    public Topic(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }
}
