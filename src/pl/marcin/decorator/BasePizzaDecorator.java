package pl.marcin.decorator;

public abstract class BasePizzaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public BasePizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedPizza.getCost();
    }
}
