package pl.marcin.strategy.car;

public final class ManualGearBox implements GearBox {
    private String type = "Manual";
    private int speed = 0;

    public int getSpeed() {
        return speed;
    }

    @Override
    public void switchGear(int speed) {
        if (speed > 20) {
            System.out.println("You can speedup only 20 km/k, then need to switch gear");
        } else {
            this.speed += speed;
            System.out.println("Switch your gear manually to incerase speed");
        }
    }

    @Override
    public String toString() {
        return "Gearbox type: " + type;
    }
}
