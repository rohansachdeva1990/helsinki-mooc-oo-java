import java.util.Arrays;

public class JudgePanel {

    private static final int MAX_SCORE = 20;
    private static final int MIN_SCORE = 10;
    private static final int NUM_JUDGES = 5;
    private static final RandomValueGenerator scoreGenerator;

    static {
        scoreGenerator = new RandomValueGenerator(MIN_SCORE, MAX_SCORE);
    }

    public JudgePanel() {
    }

    public int[] getScores() {
        int[] judgeScores = new int[NUM_JUDGES];
        for (int i = 0; i < NUM_JUDGES; i++) {
            judgeScores[i] = scoreGenerator.generate();
        }
        return judgeScores;
    }

    public static int convertToPoints(int[] scores) {
        Arrays.sort(scores);
        int points = 0;
        for (int i = 1; i < scores.length - 1; i++) {
            points += scores[i];
        }
        return points;
    }

    public static String judgeScorePrettyPrint(int[] scores) {
        return String.format("judge votes: %s", Arrays.toString(scores));
    }

}
