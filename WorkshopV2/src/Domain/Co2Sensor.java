package Domain;

public class Co2Sensor extends Sensor{
    @Override
    public double getValue(){
        return measureValue();
    }

    private double measureValue() {
        return (Math.random() * (300) + 400);
    }

    @Override
    public String toString(){
        return "Type: " + "Co2 Sensor " + "Name: " + this.getName() + "Id: " + this.getId() + "Value: " + getValue();
    }
}
