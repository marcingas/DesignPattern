package pl.marcin.strategy.car;

public class CarMain {
    public static void main(String[] args) {
        GearBox manual = new ManualGearBox();
        GearBox automat = new AutoGearBox();
        //Manual Gearbox:
        useGearBox(20,manual);
        useGearBox(20,manual);
        useGearBox(20,manual);
        useGearBox(20,manual);
        useGearBox(20,manual);
        //Automat GearBox
        useGearBox(130,automat);

    }

    public static void useGearBox(int expectedSpeed,GearBox gearBox){
        System.out.println("---- " + gearBox + " -------");
        gearBox.switchGear(expectedSpeed);
        if(gearBox instanceof ManualGearBox){
        System.out.println("Your actual speed is: " + gearBox.getSpeed());
        }




    }

}
