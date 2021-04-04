
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        System.out.println("The top ten players based on goals.");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\nThe top 25 players based on penalty amounts.");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("\nThe Statistics for Sidney Crosby.");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nThe Statistics for Philadelphia Flyers.");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("\nThe players in Anaheim Ducks.");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
