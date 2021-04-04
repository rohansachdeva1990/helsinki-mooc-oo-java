public class Flight {

    private Plane plane;
    private String departureAirportCode;
    private String destinationAirportCode;

    public Flight(Plane plane, String departureAirportCode, String destinationAirportCode) {
        this.plane = plane;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getDepartureAirportCode() {
        return departureAirportCode;
    }

    public String getDestinationAirportCode() {
        return destinationAirportCode;
    }

    @Override
    public String toString() {
        return plane + " (" + departureAirportCode + "-" + destinationAirportCode + ")";
    }
}
