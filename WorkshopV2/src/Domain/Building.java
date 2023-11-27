package Domain;

<<<<<<< Updated upstream
public class Building {
=======
import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit{
    private ArrayList<Sensor> sensors = new ArrayList<Sensor>();
    private ArrayList<Actuator> actuators = new ArrayList<Actuator>();

    public ArrayList<Sensor> getSensors() {

    }

    public ArrayList<Actuator> getActuators(){

    }
    public UUID addTempeatureSensor(String name) {

    }

    public UUID addCo2Sensor(String name) {

    }

    public void removeSensor(UUID id) {

    }

    public UUID addVentActuator(String name) {

    }

    public void removeActuator(UUID id) {

    }
>>>>>>> Stashed changes
}
