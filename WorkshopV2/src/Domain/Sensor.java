package Domain;

public abstract class Sensor extends Unit{
    Sensor(String name) {
        super(name);
    }

    abstract double getValue();
}
