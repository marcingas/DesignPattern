package pl.marcin.builder.buildercontrol;

import pl.marcin.builder.engine.Engine;

public class Car {
    private String make;
    private String model;
    private int doors;
    private int seats;
    private String tyres;

    private boolean gps;
    private Engine engine;

    private Car(CarBuilder carBuilder) {
        this.make = carBuilder.make;
        this.model = carBuilder.model;
        this.doors = carBuilder.doors;
        this.seats = carBuilder.seats;
        this.tyres = carBuilder.tyres;
        this.gps = carBuilder.gps;
        this.engine = carBuilder.engine;
    }



    @Override
    public String toString() {
        return "Car{" +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", doors=" + doors +
                ", seats=" + seats +
                ", tyres='" + tyres + '\'' +
                ", GPS=" + gps +
                ", engine=" + engine +
                '}';
    }
    public static class CarBuilder{

        private String make;
        private String model;
        private int doors;
        private int seats;
        private String tyres;
        private boolean gps;
        private Engine engine;


        public CarBuilder setMake(String make) {
            this.make=make;
            return this;
        }


        public CarBuilder setModel(String model) {
            this.model=model;
            return this;
        }


        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;

        }


        public CarBuilder setDoors(int doors) {
            this.doors= doors;
            return this;

        }


        public CarBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;

        }


        public CarBuilder setGps(boolean gps) {
            this.gps=gps;
            return this;

        }


        public CarBuilder setTyres(String tyres) {
            this.tyres = tyres;
            return this;

        }


        public Car build() {
            return new Car(this);
        }

    }
}


