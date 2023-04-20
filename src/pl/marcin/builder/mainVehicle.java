package pl.marcin.builder;

public class mainVehicle {
    public static void main(String[] args) {
        VehicleBuilder car = new VehicleBuilder();
       Vehicle opel = car.setModel("Opel")
                .setColor("White")
                .setHasSteeringWheel(true)
                .setHasWheels(true)
                .setMaxSpeed(200.33)
                .build();
        System.out.println(opel);


    }
}
