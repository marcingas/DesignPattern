package pl.marcin.strategy.laptopcharger;

public class LightSpeedCharger implements Charger {
    private String shape = "rectangle";
    private int chargingSpeed = 100;
    private String color = "blue";


    public LightSpeedCharger() {
    }

    @Override
    public void showParam() {
        System.out.println("Light speed charger, shape: " + shape +
                ", color: " + color + ", Charging speed: " + chargingSpeed);

    }

    @Override
    public void chargeLaptop(Laptop laptop) {
        if ((laptop.batteryLevel + chargingSpeed) > 100) {
            laptop.batteryLevel = 100;
        } else {
            laptop.batteryLevel += chargingSpeed;
        }
        System.out.println("Your laptop: " +laptop.name+ " is charged now, new level is:" + laptop.batteryLevel);
    }
}
