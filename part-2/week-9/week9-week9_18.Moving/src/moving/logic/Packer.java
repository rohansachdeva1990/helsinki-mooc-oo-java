package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    /*    private Map<Integer, Box> packedBoxes = new HashMap<Integer, Box>();
        private int currentBoxIndex = 0;
        private int currentVolume = 0;*/
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> box = new ArrayList<Box>();
        int i = 0;
        for (Thing thing : things) {
            box.add(new Box(this.boxesVolume));
            box.get(i).addThing(thing);
            i++;
        }
        return box;
    }

/*
    private void add(Thing thing) {
        if (noSpaceAvailable(thing)) {
            Box newBox = new Box(boxesVolume);
            newBox.addThing(thing);
            packedBoxes.put(++currentBoxIndex, newBox);
            currentVolume = thing.getVolume();
        } else {
            Box oldBox = packedBoxes.get(currentBoxIndex);
            oldBox.addThing(thing);
            currentVolume += thing.getVolume();
        }
    }

    private boolean noSpaceAvailable(Thing thing) {
        return currentVolume == 0 ||
                thing.getVolume() + currentVolume > boxesVolume;
    }

    private List<Box> getBoxes() {
        return new ArrayList<Box>(packedBoxes.values());
    }
*/

}
