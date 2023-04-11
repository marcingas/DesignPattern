package pl.marcin.strategy.laptopcharger;

public class MiddleClassCharger implements Charger{
    private String shape = "rectangle";
    private int chargingSpeed= 70;
    private String color= "blue";


    public MiddleClassCharger() {
    }

    @Override
    public void showParam() {
        System.out.println("Middle class charger, shape: " + shape +
                ", color: " +  color + ", Charging speed: " + chargingSpeed);

    }

    @Override
    public void chargeLaptop(Laptop laptop) {
        if((laptop.batteryLevel + chargingSpeed) > 95){
            laptop.batteryLevel = 95;
        } else{
            laptop.batteryLevel += chargingSpeed;
        }
        System.out.println("Your laptop: " +laptop.name+ " is charged now, new level is:" + laptop.batteryLevel);

    }
}
