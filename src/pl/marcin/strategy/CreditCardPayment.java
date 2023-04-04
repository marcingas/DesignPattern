package pl.marcin.strategy;

import java.util.Scanner;

public class CreditCardPayment implements PaymentForm{
    private int cvvCode;
    private int creditCardNum;

    Scanner scanner = new Scanner(System.in);

    @Override
    public String processPayment(double ammount) {
        System.out.println("You choose Credit Card, type your card nr: ");
        creditCardNum = scanner.nextInt();
        System.out.println("Type your cvv code: ");
        cvvCode = scanner.nextInt();
        return "...charging your card "+creditCardNum + ", code: "+ cvvCode +" with: "+
                ammount+" USD...,amount transferred  ";
    }
}
