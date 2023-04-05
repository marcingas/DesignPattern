package pl.marcin.decorator;

public class PizzeriaRunner {
    public static void main(String[] args) {
        Pizza margerita = new Margerita("Margerita");
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
    }

    public static void methodRunner(Pizza pizza){

        System.out.println("Twoje zamówienie: " + pizza.getDescription());
        System.out.println("Cena: " + pizza.getCost() + " PLN");



    }

}

