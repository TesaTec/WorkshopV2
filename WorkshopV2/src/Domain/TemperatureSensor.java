package Domain;

public class TemperatureSensor extends Sensor{
    @Override
    public double getValue(){
        return measureValue();
    }

    private double measureValue() {
        return (Math.random() * (16) + 15);
    }

    @Override
    public String toString(){
        return "Type: " + "Temperature Sensor " + "Name: " + this.getName() + "Id: " + this.getId() + "Temp: " + getValue();
    }

}
