package pl.marcin.strategy.car;

public sealed interface GearBox permits AutoGearBox, ManualGearBox {
    void switchGear(int speed);
    int getSpeed();
}
