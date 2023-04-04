package pl.marcin.strategy;

import java.util.Scanner;

public class InternetBankTransfer implements PaymentForm{
    private String bankName;
    Scanner scanner = new Scanner(System.in);



    @Override
    public String processPayment(double amount) {
        System.out.println("You choose internetBankTransfer, type your bank name: ");
        bankName = scanner.nextLine();

        return "connecting to your bank: " + bankName + ", now please log in to your account and accept amount: " +
                amount + " USD";
    }
}
