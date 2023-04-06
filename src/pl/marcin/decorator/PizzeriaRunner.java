package pl.marcin.decorator;

public class PizzeriaRunner {
    public static void main(String[] args) {
        Pizza margerita = new BasePizza("Margerita",34);
        System.out.println("Base order: ");
        methodRunner(margerita);
        System.out.println("First addition: Ham ");
        margerita = new DecoratorHam(margerita);
        methodRunner(margerita);
        System.out.println("Second addition: Cheese");
        margerita = new DecoratorCheese(margerita);
        methodRunner(margerita);
        System.out.println("Third addition: Bacon");
        margerita= new DecoratorBacon(margerita);
        methodRunner(margerita);
//        Other ways of instantiate it :
        Pizza margerita1 = new BasePizza("Margerita",20);
        margerita1 = new DecoratorBacon(new DecoratorCheese(new DecoratorHam(margerita1)));
        methodRunner(margerita1);
        Pizza quattro = new BasePizza("Quattro",15);
        quattro = new DecoratorCheese(new DecoratorHam(new DecoratorBacon(quattro)));
        methodRunner(quattro);
        Pizza italiana = new BasePizza("Italiana",60);
        methodRunner(new DecoratorBacon(new DecoratorCheese(new DecoratorBacon(italiana))));
        methodRunner(new DecoratorBacon(new DecoratorCheese(new BasePizza("French",45))));
    }

    public static void methodRunner(Pizza pizza){
        System.out.println("Twoje zamówienie: " + pizza.getDescription());
        System.out.println("Cena: " + pizza.getCost() + " PLN");
    }
}

