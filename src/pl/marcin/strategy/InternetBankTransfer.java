package pl.marcin.strategy;

import java.util.Scanner;

public class InternetBankTransfer implements PaymentForm{
    private String bankName;

    public InternetBankTransfer(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String processPayment(double amount) {

        return "connecting to your bank: " + bankName + ", now please log in to your account and accept amount: " +
                amount + " USD";
    }
}
