import java.util.Scanner;

public class Main {

    private static final String ADD = "Add";
    private static final String OBSERVATION = "Observation";
    private static final String SHOW = "Show";
    private static final String STATISTICS = "Statistics";
    private static final String QUIT = "Quit";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdWatcher birdWatcher = new BirdWatcher(scanner);

        String command;
        while (true) {
            System.out.print("? ");
            command = scanner.nextLine();

            if (ADD.equals(command)) {
                birdWatcher.add();
            } else if (OBSERVATION.equals(command)) {
                birdWatcher.observation();
            } else if (STATISTICS.equals(command)) {
                birdWatcher.statistics();
            } else if (SHOW.equals(command)) {
                birdWatcher.show();
            } else if (QUIT.equals(command)) {
                break;
            }
        }
    }

}
