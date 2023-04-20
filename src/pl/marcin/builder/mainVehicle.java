package pl.marcin.builder;

public class mainVehicle {
    public static void main(String[] args) {
        VehicleBuilder carbuilder = new VehicleBuilder();
       Vehicle opel = carbuilder.setModel("Opel")
                .setColor("White")
                .setHasSteeringWheel(true)
                .setHasWheels(true)
                .setMaxSpeed(200.33)
                .build();
        System.out.println(opel);


    }
}
