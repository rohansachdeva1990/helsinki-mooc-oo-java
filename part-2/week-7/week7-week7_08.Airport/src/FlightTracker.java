import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightTracker {

    private List<Flight> flights = new ArrayList<Flight>();
    private Map<String, Plane> planeMap = new HashMap<String, Plane>();

    public void add(Plane plane) {
        planeMap.put(plane.getId(), plane);
    }

    public void add(Flight flight) {
        flights.add(flight);
    }

    public Plane getPlane(String id) {
        return planeMap.get(id);
    }

    public List<Plane> getPlanes() {
        return new ArrayList<Plane>(planeMap.values());
    }

    public List<Flight> getFlights() {
        return new ArrayList<Flight>(flights);
    }
}
