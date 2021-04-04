import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();

    public boolean add(RegistrationPlate plate, String owner) {
        if (!owners.containsKey(plate)) {
            owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        return null != owners.remove(plate);
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        Set<String> uniqueOwnerNames = new HashSet<String>(owners.values());
        for (String owner : uniqueOwnerNames) {
            System.out.println(owner);
        }
    }
}
