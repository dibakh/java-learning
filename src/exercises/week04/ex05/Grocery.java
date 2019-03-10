package Ex05;
//        Create the Grocery class that has one name.
public class Grocery {
    private String name;

    public Grocery(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grocery grocery = (Grocery) o;

        return name.equals(grocery.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
