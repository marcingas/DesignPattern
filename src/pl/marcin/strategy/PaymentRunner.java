package pl.marcin.strategy;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class PaymentRunner {
    public static void main(String[] args) {
        choosePaymentMethod("InternetBankTransfer",500.00);
        choosePaymentMethod("BLIK",400);


    }

    public static void choosePaymentMethod(String paymentMethod, double amount) {
        Scanner scanner = new Scanner(System.in);

        if (paymentMethod.equalsIgnoreCase("InternetBankTransfer")) {

            System.out.println("You choose internetBankTransfer, type your bank name: ");
            String bank = scanner.nextLine();
            PaymentForm paymentForm = new InternetBankTransfer(bank);
            System.out.println(paymentForm.processPayment(amount));

        }else if(paymentMethod.equalsIgnoreCase("BLIK")){
            System.out.println("You choose BLIK, type your BLIK code: ");
            int code = scanner.nextInt();
            PaymentForm paymentForm = new Blik(code);
            System.out.println(paymentForm.processPayment(amount));
    }else {
            System.out.println("Not implemented method");
        }
    }
}

