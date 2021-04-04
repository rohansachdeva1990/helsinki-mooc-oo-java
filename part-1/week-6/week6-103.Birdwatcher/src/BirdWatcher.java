import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirdWatcher {

    private final Scanner scanner;
    private List<Bird> birds = new ArrayList<Bird>();

    public BirdWatcher(Scanner scanner) {
        this.scanner = scanner;
    }

    public void add() {
        Bird bird = new Bird();
        System.out.println("Name: ");
        bird.setName(scanner.nextLine());
        System.out.println("Latin Name: ");
        bird.setLatinName(scanner.nextLine());
        birds.add(bird);
    }

    public void observation() {
        System.out.println("What was observed: ?");
        String observed = scanner.nextLine();
        for (Bird bird : birds) {
            if (bird.getName().equals(observed)) {
                bird.observed();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void show() {
        System.out.println("What? ");
        String toShow = scanner.nextLine();

        for (Bird bird : birds) {
            if (bird.getName().equals(toShow)) {
                System.out.println(bird);
                break;
            }
        }
    }

}
