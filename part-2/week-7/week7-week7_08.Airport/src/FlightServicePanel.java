import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightServicePanel {

    private FlightTracker flightTracker;
    private Menu menu;
    private Scanner reader;

    public FlightServicePanel(FlightTracker flightTracker, Scanner reader) {
        this.flightTracker = flightTracker;
        this.reader = reader;
        menu = initializeMenu();
    }

    private Menu initializeMenu() {
        List<Menu.MenuOption> options = new ArrayList<Menu.MenuOption>();
        options.add(createMenuOption(Command.PRINT_PLANES));
        options.add(createMenuOption(Command.PRINT_FLIGHTS));
        options.add(createMenuOption(Command.PRINT_PLANE_INFO));
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
                case PRINT_PLANES:
                    printPlanes();
                    break;
                case PRINT_FLIGHTS:
                    printFlights();
                    break;
                case PRINT_PLANE_INFO:
                    printPlaneInfo();
                    break;
                case QUIT:
                    return;
            }
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println(flightTracker.getPlane(id));
    }

    private void printFlights() {
        for (Flight flight : flightTracker.getFlights()) {
            System.out.println(flight);
        }
    }

    private void printPlanes() {
        for (Plane plane : flightTracker.getPlanes()) {
            System.out.println(plane);
        }
    }

    private void printTitle() {
        System.out.println("Flight service\n------------\n");
    }

    private enum Command {
        PRINT_PLANES("1", "Print planes"),
        PRINT_FLIGHTS("2", "Print flights"),
        PRINT_PLANE_INFO("3", "Print plane info"),
        QUIT("x", "Quit"),
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
