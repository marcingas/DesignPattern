package pl.marcin.decorator;

public class PizzeriaRunner {
    public static void main(String[] args) {
        Pizza margerita = new Margerita("Margerita");
        methodRunner(margerita);
    }

    public static void methodRunner(Pizza pizza){
        System.out.println("Twoje zamówienie: " + pizza.getDescription());
        System.out.println("Cena: " + pizza.getCost() + " PLN");
    }

}

