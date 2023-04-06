package pl.marcin.builder;

import pl.marcin.builder.buildercontrol.Car;
import pl.marcin.builder.engine.DieselEngine;

public class ClientRunner {
    public static void main(String[] args) {
        Car suvCar = new Car.CarBuilder()
                .setMake("Volvo")
                .setModel("Xc60")
                .setDoors(5)
                .setEngine(new DieselEngine("T5",2.4))
                .setGps(true)
                .setTyres("OFF Road")
                .setSeats(7)
                .build();
        System.out.println(suvCar);



    }
}
