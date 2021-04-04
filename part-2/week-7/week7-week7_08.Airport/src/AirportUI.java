import java.util.Scanner;

public class AirportUI {
    private FlightTracker flightTracker;
    private AirportPanel airportPanel;
    private FlightServicePanel flightServicePanel;

    public AirportUI(Scanner reader) {
        flightTracker = new FlightTracker();
        airportPanel = new AirportPanel(flightTracker, reader);
        flightServicePanel = new FlightServicePanel(flightTracker, reader);
    }

    public void start() {
        airportPanel.show();
        flightServicePanel.show();
    }
}
