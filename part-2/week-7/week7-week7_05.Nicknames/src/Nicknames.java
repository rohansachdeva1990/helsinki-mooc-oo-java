
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        Map<String, String> nicknamesMap = new HashMap<String, String>();
        nicknamesMap.put("matti", "mage");
        nicknamesMap.put("mikael", "mixu");
        nicknamesMap.put("arto", "arppa");

        System.out.println(nicknamesMap.get("mikael"));
    }

}
