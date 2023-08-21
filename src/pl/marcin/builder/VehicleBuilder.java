package pl.marcin.builder;

public class VehicleBuilder {
    private String model;
    private String color;
    private boolean steeringWheel;
    private boolean wheels;
    private double maxSpeed;

    public String getModel() {
        return model;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public String getColor() {
        return color;
    }
    public boolean hasWheels() {
        return wheels;
    }
    public boolean hasSteeringWheel() {
        return steeringWheel;
    }

    public VehicleBuilder setModel(String model) {
        this.model = model;
        return this;
    }



    public VehicleBuilder setColor(String color) {
        this.color = color;
        return this;
    }



    public VehicleBuilder setHasSteeringWheel(boolean steeringWheel) {
        this.steeringWheel = steeringWheel;
        return this;
    }



    public VehicleBuilder setHasWheels(boolean wheels) {
        this.wheels = wheels;
        return this;
    }



    public VehicleBuilder setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }
    public Vehicle build(){
        return new Vehicle(this);
    }

}
