package pl.marcin.decorator;

public abstract class MargeritaDecorator implements Pizza {
    protected Pizza decoratedPizza;

    public MargeritaDecorator(Pizza decoratedPizza) {
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
