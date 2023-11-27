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
        this.id = UUID.randomUUID();
        this.name = name;
    }

    abstract public String toString();
}
