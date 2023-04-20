package pl.marcin.advancedbuilder.buildercontrol;

import pl.marcin.advancedbuilder.engine.DieselEngine;

public class ConstructManager {

    public Car costructCar(CarBuilder carBuilder){
       return carBuilder
                .setDoors(5)
                .setMake("Volkswagen")
                .setModel("Caravelle")
                .setEngine(new DieselEngine("TDI",2.5))
                .setGps(true)
               .setSeats(7)
                .setTyres("R17: 205x55")
                .build();

    }
}
