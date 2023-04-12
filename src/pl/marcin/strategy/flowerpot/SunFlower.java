package pl.marcin.strategy.flowerpot;

public class SunFlower implements Flower {
    private int leavesNr;
    private String description;

    public SunFlower(int leavesNr, String description) {
        this.leavesNr = leavesNr;
        this.description = description;
    }

    @Override
    public String smellFlower() {
        return "Doesn't feel anything";
    }

    @Override
    public int countLeaves() {
        return leavesNr;
    }

    @Override
    public String describeFlower() {
        return description;
    }

    @Override
    public String toString() {
        return "SunFlower";
    }
}
