package pl.marcin.strategy.laptopcharger;

public class LaptopChargeMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Lenovo", 10);
        connectCharger(laptop, new OldCharger());
        laptop.setBatteryLevel(10);
        connectCharger(laptop, new MiddleClassCharger());
        laptop.setBatteryLevel(10);
        connectCharger(laptop, new LightSpeedCharger());


    }


    public static void connectCharger(Laptop laptop, Charger charger) {
        System.out.println("\nnew charging in progress...............");
        charger.showParam();
        charger.chargeLaptop(laptop);
    }
}
