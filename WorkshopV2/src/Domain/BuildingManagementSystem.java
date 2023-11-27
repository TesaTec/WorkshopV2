package Domain;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem {

    ArrayList<Building> buildings = new ArrayList<Building>();

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    public UUID addBuilding(String name) {
       buildings.add(new Building(name));
       return buildings.getLast().getId();
    }
    public void removeBuilding(UUID id) {
        for(int i = 0; i < buildings.size(); i++) {
            if(buildings.get(i).getId() == id) {
                buildings.remove(i);
                return;
            }
        }
        System.out.println("There was not a building associated with the given id");
    }
}
