package pl.marcin.advancedbuilder;

import pl.marcin.advancedbuilder.buildercontrol.Car;
import pl.marcin.advancedbuilder.buildercontrol.CarBuilder;
import pl.marcin.advancedbuilder.buildercontrol.ConstructManager;

public class ClientRunner {
    public static void main(String[] args) {
        System.out.println("SUV_______\n");


        ConstructManager manager = new ConstructManager();
        var carBuilder = new CarBuilder();
       Car van =  manager.costructCar(carBuilder);
        System.out.println(van);




    }
}
