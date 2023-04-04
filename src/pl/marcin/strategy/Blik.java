package pl.marcin.strategy;

import java.util.Scanner;

public class Blik implements PaymentForm{
    private int blikCode;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String processPayment(double amount) {
        System.out.println("You choose BLIK, type your BLIK code: ");
        int code = scanner.nextInt();
        return "Accepting your Blik code "+ code +"..., " + amount + " USD amount transfered";
    }
}
