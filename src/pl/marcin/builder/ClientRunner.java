package pl.marcin.builder;

import pl.marcin.builder.buildercontrol.Car;
import pl.marcin.builder.buildercontrol.CarBuilder;
import pl.marcin.builder.buildercontrol.ConstructManager;
import pl.marcin.builder.engine.DieselEngine;
import pl.marcin.builder.engine.GasEngine;
import pl.marcin.builder.engine.SportEngine;

public class ClientRunner {
    public static void main(String[] args) {
        System.out.println("SUV_______\n");


        ConstructManager manager = new ConstructManager();
        var carBuilder = new CarBuilder();
       Car van =  manager.costructCar(carBuilder);
        System.out.println(van);




    }
}
