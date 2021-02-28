import java.util.HashMap;
import java.util.Map;
public final class Location {
    final int locationID;
    public String description;
    protected Map<String, Integer> exits;
    public Location(int locationID, String description, Map<String, Integer>
            exits) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);
        this.exits.put("Q", 0);
    }
    private final void addExit(String direction, int location) {
        exits.put(direction, location);
    }
    private final int getLocationID() {
        return locationID;
    }

    private final String getDescription() {
        return description;
    }

    private final Map<String, Integer> getExits() {
        return exits;
    }
}
