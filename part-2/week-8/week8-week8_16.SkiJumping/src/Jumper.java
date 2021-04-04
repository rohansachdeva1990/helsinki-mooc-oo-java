import java.util.ArrayList;
import java.util.List;

public class Jumper implements Comparable<Jumper> {
    private static final int MAX_VALUE = 120;
    private static final int MIN_VALUE = 60;
    private static final RandomValueGenerator randomJumpGenerator;

    private String name;
    private List<Integer> jumps = new ArrayList<Integer>();
    private int points;

    static {
        randomJumpGenerator = new RandomValueGenerator(MIN_VALUE, MAX_VALUE);
    }

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
    }

    public int jump() {
        int jump = randomJumpGenerator.generate();
        addPoints(jump);
        this.jumps.add(jump);
        return jump;
    }

    public String getName() {
        return name;
    }

    public synchronized void addPoints(int newPoints) {
        points += newPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jumper jumper = (Jumper) o;

        if (points != jumper.points) return false;
        if (name != null ? !name.equals(jumper.name) : jumper.name != null) return false;
        return jumps != null ? jumps.equals(jumper.jumps) : jumper.jumps == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (jumps != null ? jumps.hashCode() : 0);
        result = 31 * result + points;
        return result;
    }

    @Override
    public int compareTo(Jumper o) {
        return this.points - o.points;
    }

    @Override
    public String toString() {
        return String.format("%s (%d points)", name, points);
    }

    public String getJumpsPrettyFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append("jump lengths:");
        for (int jump : jumps) {
            sb.append(" ").append(jump).append(" m,");
        }
        return sb.substring(0, sb.length() - 1);
    }
}
