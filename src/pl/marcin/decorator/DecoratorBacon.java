package pl.marcin.decorator;

public class DecoratorBacon extends BasePizzaDecorator {
    public DecoratorBacon(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n3. addition: Bacon";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3.0;
    }
}
