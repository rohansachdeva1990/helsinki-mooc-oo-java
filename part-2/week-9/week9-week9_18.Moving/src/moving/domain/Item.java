package moving.domain;

public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s (%d dm^3)", getName(), getVolume());
    }

    @Override
    public int compareTo(Item o) {
        return this.getVolume() - o.getVolume();
    }
}
