package pl.marcin.decorator;

public class BasePizza implements Pizza {
    private String name;
    private double price;

    public BasePizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return price;
    }
}
