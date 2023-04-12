package pl.marcin.strategy.flowerpot;

public class FlowerPotMain {
    public static void main(String[] args) {
        Flower rose = new Rose(3, "Red Rose");
        Flower daisy = new Daisy("small, white-yellow daisy");
        Flower sunFlower = new SunFlower(6, "Huge, yellow Sunflower");

        takeCare(plantFlower(rose));
        takeCare(plantFlower(daisy));
        takeCare(plantFlower(sunFlower));
    }

    public static Flower plantFlower(Flower flower) {
        System.out.println("\n");
        System.out.println(flower + " grain planted, water it and watch it grow!");
        return flower;
    }

    public static void takeCare(Flower flower) {
        System.out.println("\nnew flower in pot: " + flower);
        System.out.println(flower.describeFlower());
        System.out.println("There is " + flower.countLeaves() + " leaves already :) ");
        System.out.println(flower.smellFlower());

    }

}
