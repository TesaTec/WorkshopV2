package Domain;

import java.util.UUID;
public class VentilationActuator extends Actuator {
    double value;
    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        return "Type: " + "Actuator " + "Name: " + this.getName() + "Id: " + this.getId() + "Value: " + getValue();
    }

}
