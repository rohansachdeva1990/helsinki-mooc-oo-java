import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportPanel {
    private FlightTracker flightTracker;
    private final Menu menu;
    private Scanner reader;

    public AirportPanel(FlightTracker flightTracker, Scanner reader) {
        this.flightTracker = flightTracker;
        this.reader = reader;
        menu = initializeMenu();
    }

    private Menu initializeMenu() {
        List<Menu.MenuOption> options = new ArrayList<Menu.MenuOption>();
        options.add(createMenuOption(Command.ADD_AIRPLANE));
        options.add(createMenuOption(Command.ADD_FLIGHT));
        options.add(createMenuOption(Command.QUIT));
        return new Menu(options);
    }

    private static Menu.MenuOption createMenuOption(Command command) {
        return new Menu.MenuOption(command.getCommandId(), command.getActualName());
    }

    public void show() {
        printTitle();
        while (true) {
            System.out.print(menu);
            String command = reader.nextLine();
            switch (Command.getByCommandId(command)) {
                case ADD_AIRPLANE:
                    addPlane();
                    break;
                case ADD_FLIGHT:
                    addFlight();
                    break;
                case QUIT:
                    System.out.println("");
                    return;
            }
        }
    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        flightTracker.add(new Plane(id, capacity));
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureAirportCode = reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationAirportCode = reader.nextLine();
        flightTracker.add(new Flight(flightTracker.getPlane(id), departureAirportCode, destinationAirportCode));
    }

    private void printTitle() {
        System.out.println("Airport panel\n--------------------\n");
    }

    private enum Command {
        ADD_AIRPLANE("1", "Add airplane"),
        ADD_FLIGHT("2", "Add flight"),
        QUIT("x", "Exit"),
        INVALID("-", "-");

        private String commandId;
        private String actualName;

        Command(String commandId, String actualName) {
            this.commandId = commandId;
            this.actualName = actualName;
        }

        public String getCommandId() {
            return commandId;
        }

        public String getActualName() {
            return actualName;
        }

        public static Command getByCommandId(String commandId) {
            for (Command c : values()) {
                if (c.commandId.equals(commandId)) {
                    return c;
                }
            }
            return INVALID;
        }
    }
}
