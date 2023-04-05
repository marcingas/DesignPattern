package pl.marcin.decorator;

public class DecoratorHam extends MargeritaDecorator{
    public DecoratorHam(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n1. addition:  Ham";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
