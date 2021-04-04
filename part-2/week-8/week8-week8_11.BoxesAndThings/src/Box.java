import java.util.ArrayList;

public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things = new ArrayList<ToBeStored>();
    private final double maxWeight;
    private double currentWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored thing) {
        if (thing.weight() + currentWeight > maxWeight) {
            return;
        }
        things.add(thing);
        currentWeight += thing.weight();
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored toBeStored : things) {
            weight += toBeStored.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Box: %d things, total weight %.1f kg", things.size(), weight());
    }
}
