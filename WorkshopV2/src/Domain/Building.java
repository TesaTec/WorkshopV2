package Domain;

import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit{
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Actuator> actuators = new ArrayList<Actuator>();

    Building(String name) {
        super(name);
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuators(){
        return actuators;
    }
    public UUID addTemperatureSensor(String name) {
        sensors.add(new TemperatureSensor(name));
        return sensors.getLast().getId();
    }

    public UUID addCo2Sensor(String name) {
        sensors.add(new Co2Sensor(name));
        return sensors.getLast().getId();
    }

    public void removeSensor(UUID id) {
        for(int i = 0; i < sensors.size(); i++) {
            if(sensors.get(i).getId()== id) {
                sensors.remove(i);
                return;
            }
        }
        System.out.println("There was not a sensor associated with the given id");
    }

    public UUID addVentActuator(String name) {
        actuators.add(new VentilationActuator(name));
        return actuators.getLast().getId();
    }

    public void removeActuator(UUID id) {
        for(int i = 0; i < actuators.size(); i++) {
            if(actuators.get(i).getId()== id) {
                actuators.remove(i);
                return;
            }
        }
        System.out.println("There was not an actuator associated with the given id");
    }

    @Override
    public String toString() {
        return null;
    }
}
