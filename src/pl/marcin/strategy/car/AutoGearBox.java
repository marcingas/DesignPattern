package pl.marcin.strategy.car;

public final class AutoGearBox implements GearBox {
    private String type = "Automatic";


    @Override
    public void switchGear(int speed) {
        System.out.println("Auto GearBox On!");
        int tempSpeed = speed / 5;
        for (int i = 1; i < 6; i++) {
            System.out.println("Gear: " + i + ", speed: " + (tempSpeed));
            tempSpeed += speed / 5;
        }
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String toString() {
        return "Gearbox type: " + type;
    }
}
