package pl.marcin.strategy.laptopcharger;

public class Laptop {
    String name;
    int batteryLevel;

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Laptop(String name, int batteryLevel) {
        this.name = name;
        if (batteryLevel > 100) {
            this.batteryLevel = 100;
        } else if (batteryLevel < 0) {
            this.batteryLevel = 0;
        } else {
            this.batteryLevel = batteryLevel;
        }
    }

    @Override
    public String toString() {
        return "Laptop:" + name +
                ", batteryLevel:" + batteryLevel;
    }
}
