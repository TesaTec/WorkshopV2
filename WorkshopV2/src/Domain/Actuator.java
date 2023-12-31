package Domain;

public abstract class Actuator extends Unit{
    private double value;

    Actuator(String name) {
        super(name);
    }

    abstract public void setValue(double value);
    abstract public double getValue();

}
