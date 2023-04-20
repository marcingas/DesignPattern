package pl.marcin.advancedbuilder.engine;

public class Engine {
    private String name;
    private String type;
    private double capacity;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getCapacity() {
        return capacity;
    }
    public Engine(){

    }
    public Engine(String name, double capacity,String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + ", " + type + ", " + capacity;
    }
}

