package pl.marcin.strategy.laptopcharger;

public class OldCharger implements Charger{
    private String shape = "square";
    private int chargingSpeed= 40;
    private String color= "red";


    public OldCharger() {
    }

    @Override
    public void showParam() {
        System.out.println("Old version of Charger, shape: " + shape +
              ", color: " +  color + ", Charging speed " + chargingSpeed);

    }

    @Override
    public void chargeLaptop(Laptop laptop) {
        if((laptop.batteryLevel + chargingSpeed) > 70){
        laptop.batteryLevel = 70;
        } else{
            laptop.batteryLevel += chargingSpeed;
        }
        System.out.println("Your laptop: " +laptop.name+ " is charged now, new level is:" + laptop.batteryLevel);

    }
}
