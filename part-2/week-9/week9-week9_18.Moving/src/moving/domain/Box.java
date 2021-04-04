package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {

    private List<Thing> things = new ArrayList<Thing>();
    private int maximumCapacity;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() <= maximumCapacity) {
            things.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        int capacity = 0;
        for (Thing thing : things) {
            capacity += thing.getVolume();
        }
        return capacity;
    }

    @Override
    public String toString() {
        return "  things in the box: " + this.getVolume() + " dm^3";
    }
}
