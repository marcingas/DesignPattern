package pl.marcin.strategy.flowerpot;

public class Rose implements Flower {
    private int leavesNum;
    private String description;

    public Rose(int leavesNum, String description) {
        this.leavesNum = leavesNum;
        this.description = description;
    }

    @Override
    public String smellFlower() {
        return "Beautiful smell!!!";
    }

    @Override
    public int countLeaves() {
        return leavesNum;
    }

    @Override
    public String describeFlower() {
        return description;
    }

    @Override
    public String toString() {
        return "Rose";
    }
}
