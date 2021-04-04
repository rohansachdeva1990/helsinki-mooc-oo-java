import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    private int maxWeightLimit;
    private int currentWeight;

    public Container(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (isAllowed(suitcase)) {
            this.suitcases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }

    private boolean isAllowed(Suitcase suitcase) {
        return currentWeight + suitcase.totalWeight() <= maxWeightLimit;
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return String.format("%d suitcases (%d kg)", suitcases.size(), currentWeight);
    }
}
