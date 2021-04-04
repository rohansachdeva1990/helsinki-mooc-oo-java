public class CD implements ToBeStored{

    private String artist;
    private String title;
    private int year;


    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return String.format("%s: %s (%d)", artist, title, year);
    }
}
