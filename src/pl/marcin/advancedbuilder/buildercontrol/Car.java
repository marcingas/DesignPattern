package pl.marcin.advancedbuilder.buildercontrol;

import pl.marcin.advancedbuilder.engine.Engine;

public class Car {
    private String make;
    private String model;
    private int doors;
    private int seats;
    private String tyres;

    private boolean gps;
    private Engine engine;

    Car(CarBuilder carBuilder) {
        this.make = carBuilder.getMake();
        this.model = carBuilder.getModel();
        this.doors = carBuilder.getDoors();
        this.seats = carBuilder.getSeats();
        this.tyres = carBuilder.getTyres();
        this.gps = carBuilder.isGps();
        this.engine = carBuilder.getEngine();
    }


    @Override
    public String toString() {
        return
                "make : " + make + "\n" +
                        "model : " + model + "\n" +
                        "doors : " + doors + " \n" +
                        "seats : " + seats + "\n" +
                        "tyres : " + tyres + '\n' +
                        "GPS   : " + gps + "\n" +
                        "engine: " + engine;
    }
}


