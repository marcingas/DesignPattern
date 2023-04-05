package pl.marcin.decorator;

public class Margerita implements Pizza {
    private String name;

    public Margerita(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return 20;
    }
}
