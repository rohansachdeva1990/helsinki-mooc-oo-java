import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Tournament tournament;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        tournament = new Tournament();
    }

    public void start() {
        showTitle();
        readParticipants();
        beginTournament();
    }

    private void showTitle() {
        System.out.println("Kumpula ski jumping week\n");
    }

    private void readParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.println("  Participant name: ");
            String participantName = reader.nextLine();
            if (participantName == null || participantName.trim().isEmpty()) {
                break;
            }
            tournament.add(new Jumper(participantName));
        }
    }

    private void beginTournament() {
        System.out.println("\nThe tournament begins!\n");
        int roundIndex = 0;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String choice = reader.nextLine();
            if (choice == null || choice.isEmpty() || !"jump".equals(choice)) {
                break;
            }
            tournament.playRound(++roundIndex);
        }

        System.out.println("\nThanks!\n");
        tournament.printTournamentResults();
    }
}
