package Domain;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem {

    ArrayList<Building> buildings = new ArrayList<Building>();

    public ArrayList<Building> getBuildings() {

    }
    public UUID addBuilding(String name) {

    }
    public void removeBuilding(UUID id) {
        for(int i = 0; i < buildings.size(); i++) {
            if(buildings.get(i).getId == id) {
                buildings.remove(i);
                return;
            }
        }
        System.out.println("There wasn't a building which matched with the provided id");
    }
}
