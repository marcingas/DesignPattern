package pl.marcin.strategy;

public class CreditCardPayment implements PaymentForm{
    private int cvvCode;
    private int creditCardNum;

    public CreditCardPayment(int cvvCode, int creditCardNum) {
        this.cvvCode = cvvCode;
        this.creditCardNum = creditCardNum;
    }

    @Override
    public String processPayment(double ammount) {
        return "...charging your card "+creditCardNum + " with : "+
                ammount+" USD...,amount transferred  ";
    }
}
