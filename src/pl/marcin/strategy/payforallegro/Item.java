package pl.marcin.strategy.payforallegro;

public class Item {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Your item : "+ name +
                ", price= " + price;
    }
}
