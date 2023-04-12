package pl.marcin.strategy.flowerpot;

public class Daisy implements Flower {
    private String description;

    public Daisy(String description) {
        this.description = description;
    }

    @Override
    public String smellFlower() {
        return "No smell";
    }

    @Override
    public int countLeaves() {
        return 0;
    }

    @Override
    public String describeFlower() {
        return description;
    }

    @Override
    public String toString() {
        return "Daisy";
    }
}
