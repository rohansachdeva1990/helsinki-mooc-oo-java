import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tournament {
    private List<Jumper> jumpers = new ArrayList<Jumper>();
    private JudgePanel judgePanel = new JudgePanel();

    public void add(Jumper jumper) {
        jumpers.add(jumper);
    }

    public void playRound(int roundIndex) {
        System.out.println("\nRound " + roundIndex);
        List<Jumper> sortedJumpers = getJumpingOrderSortedByPoints();
        StringBuilder output = new StringBuilder();

        output.append("Results of round ").append(roundIndex).append("\n");
        for (Jumper jumper : sortedJumpers) {
            output.append("  ").append(jumper.getName()).append("\n");
            int jumpLength = jumper.jump();
            int[] scores = judgePanel.getScores();
            jumper.addPoints(JudgePanel.convertToPoints(scores));
            output.append("    ").append("length: ").append(jumpLength).append("\n");
            output.append("    ").append(JudgePanel.judgeScorePrettyPrint(scores)).append("\n");
        }
        output.append("\n");
        System.out.println(output.toString());
    }

    private List<Jumper> getJumpingOrderSortedByPoints() {
        Collections.sort(jumpers);
        System.out.println("\nJumping order:");
        int index = 0;
        for (Jumper jumper : jumpers) {
            System.out.printf("  %d. %s\n", ++index, jumper);
        }
        return jumpers;
    }

    public void printTournamentResults() {
        if (jumpers.isEmpty()) return;

        Collections.sort(jumpers, Collections.<Jumper>reverseOrder());
        StringBuilder output = new StringBuilder();
        output.append("Tournament results:").append("\n");
        output.append("Position    Name").append("\n");
        int position = 0;
        for (Jumper jumper : jumpers) {
            output.append(++position);
            output.append(getSpaceByValue(12 - String.valueOf(position).length()));
            output.append(jumper).append("\n");
            output.append(getSpaceByValue(12)).append(jumper.getJumpsPrettyFormat()).append("\n");
        }
        System.out.println(output.toString());
    }

    private static String getSpaceByValue(int value) {
        StringBuilder spaceBuilder = new StringBuilder();
        for (int i = 0; i < value; i++) {
            spaceBuilder.append(" ");
        }
        return spaceBuilder.toString();
    }
}
