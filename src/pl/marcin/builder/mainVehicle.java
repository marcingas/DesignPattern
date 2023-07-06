package pl.marcin.builder;

import java.util.Vector;

public class mainVehicle {
    public static void main(String[] args) {
        VehicleBuilder carbuilder = new VehicleBuilder();
        Vehicle newCar = carbuilder.setMaxSpeed(200).setColor("Blue").setModel("Porshe").build();
        System.out.println(newCar);
//        printBuilderWork(buildCar(carbuilder));



    }
private static void printBuilderWork(Vehicle vehicle){
    System.out.println("============Building result:=============\n");
    System.out.println(vehicle);
}
    private static Vehicle buildCar(VehicleBuilder carbuilder) {
        return carbuilder.setModel("Opel Astra ")
                 .setColor("White")
                 .setHasSteeringWheel(true)
                 .setHasWheels(true)
                 .setMaxSpeed(156.33)
                 .build();

    }
}
