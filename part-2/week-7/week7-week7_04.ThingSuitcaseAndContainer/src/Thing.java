import static java.lang.String.format;

public class Thing {

    private String name;
    private int weight;

    public Thing() {
    }

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return format("%s (%d kg)", name, weight);
    }
}
