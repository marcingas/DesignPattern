package pl.marcin.builder.engine;

public class Engine {
    String name;
    String type;
    double capacity;

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

