public class Bird {

    private String name;
    private String latinName;

    private int observed;

    public Bird() {
        this.observed = 0;
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }


    public void observed() {
        this.observed++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d observations", name, latinName, observed);
    }
}
