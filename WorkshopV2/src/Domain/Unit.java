package Domain;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id;

    public UUID getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    Unit(String name){
        UUID.fromString(name);
    }

    abstract public String toString();
}
