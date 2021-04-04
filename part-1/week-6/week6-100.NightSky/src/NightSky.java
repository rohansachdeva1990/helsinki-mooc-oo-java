import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int numberOfStars = 0;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < width; i++) {
            if (random.nextDouble() <= density) {
                stringBuilder.append("*");
                numberOfStars++;
            } else {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public void print() {
        // Resetting number of stars so that on next print line th number of stars should be ok
        numberOfStars = 0;
        for (int i = 0; i < height; i++) {
            printLine();
        }
    }

    public int starsInLastPrint() {
        return numberOfStars;
    }
}
