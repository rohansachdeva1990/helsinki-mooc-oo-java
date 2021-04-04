import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeightLimit;

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addThing(Thing thing) {
        if (isAllowed(thing)) {
            things.add(thing);
        }
    }

    private boolean isAllowed(Thing thing) {
        return totalWeight() + thing.getWeight() <= maxWeightLimit;
    }

    public int totalWeight() {
        int weight = 0;
        for (Thing thing : things) {
            weight += thing.getWeight();
        }
        return weight;
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public Thing heaviestThing() {
        Thing heaviestThing = null;
        if (things.size() > 0) {
            heaviestThing = things.get(0);
            for (Thing thing : things) {
                if (thing.getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = thing;
                }
            }
        }

        return heaviestThing;
    }

    @Override
    public String toString() {


        int numThings = things.size();
        if (numThings == 0) {
            return "empty (0 kg)";
        }

        if (numThings == 1) {
            return String.format("1 thing (%d kg)", totalWeight());

        }

        return String.format("%d things (%d kg)", numThings, totalWeight());
    }
}
