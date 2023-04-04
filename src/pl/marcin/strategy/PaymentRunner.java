package pl.marcin.strategy;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentForm blik = new Blik();
        PaymentForm creditCard = new CreditCardPayment();
        PaymentForm internetBankTransfer = new InternetBankTransfer();

        paymentPrinter(blik,300);
        paymentPrinter(creditCard,300);
        paymentPrinter(internetBankTransfer,300);



    }
    public static void paymentPrinter(PaymentForm form, int amount){
        System.out.println(form.processPayment(amount));
    }


}

