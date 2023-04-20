package pl.marcin.builder;

public class Vehicle {
    private String model;
    private String color;
    private boolean steeringWheel;
    private boolean wheels;
    private double maxSpeed;

    public Vehicle(VehicleBuilder vehicleBuilder) {
        this.model = vehicleBuilder.getModel();
        this.color = vehicleBuilder.getColor();
        this.steeringWheel = vehicleBuilder.hasSteeringWheel();
        this.wheels = vehicleBuilder.hasWheels();
        this.maxSpeed = vehicleBuilder.getMaxSpeed();
    }

    @Override
    public String toString() {
        return "Vehicle: " +
                "\nmodel: " + model + "\n" +
                "color: " + color + "\n" +
                "steeringWheel: " + steeringWheel +
                "\nwheels: " + wheels +
                "\nmaxSpeed: " + maxSpeed + " km/h";
    }
}
