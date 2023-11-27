package Domain;

public abstract class Actuator extends Unit{
    private double value;

    abstract public void setValue(double value);
    abstract public double getValue();

}
