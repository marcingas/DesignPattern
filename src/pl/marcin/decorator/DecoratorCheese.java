package pl.marcin.decorator;

public class DecoratorCheese extends MargeritaDecorator {
    public DecoratorCheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n2. addition: Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
