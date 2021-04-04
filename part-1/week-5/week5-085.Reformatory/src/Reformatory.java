public class Reformatory {

    private int weightsMeasuredCount;

    public int weight(Person person) {
        // return the weight of the person
        weightsMeasuredCount++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured() {
        return weightsMeasuredCount;
    }

}
