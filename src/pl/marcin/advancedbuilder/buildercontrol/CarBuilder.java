package pl.marcin.advancedbuilder.buildercontrol;


import pl.marcin.advancedbuilder.engine.Engine;

public class CarBuilder {

    private String make;
    private String model;
    private int doors;
    private int seats;
    private String tyres;
    private boolean gps;
    private Engine engine;

    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getDoors() {
        return doors;
    }

    int getSeats() {
        return seats;
    }

    String getTyres() {
        return tyres;
    }

    boolean isGps() {
        return gps;
    }

    Engine getEngine() {
        return engine;
    }

    CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }


    CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }


    CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;

    }


    CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;

    }


    CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;

    }


    CarBuilder setGps(boolean gps) {
        this.gps = gps;
        return this;

    }


    CarBuilder setTyres(String tyres) {
        this.tyres = tyres;
        return this;

    }


    Car build() {
        return new Car(this);
    }

}

