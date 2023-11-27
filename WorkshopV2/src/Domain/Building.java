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
    public UUID addTempeatureSensor(String name) {
        sensors.add(new TemperatureSensor(name));
        

    }

    public UUID addCo2Sensor(String name) {

    }

    public void removeSensor(UUID id) {

    }

    public UUID addVentActuator(String name) {

    }

    public void removeActuator(UUID id) {

    }

    @Override
    public String toString() {
        return null;
    }
}
