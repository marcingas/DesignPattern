package pl.marcin.strategy.payforallegro;

public class CreditCardPayment implements PaymentForm {
    private int cvvCode;
    private String creditCardNum;

    public CreditCardPayment(int cvvCode, String creditCardNum) {
        this.cvvCode = cvvCode;
        this.creditCardNum = creditCardNum;
    }


    @Override
    public String processPayment(double amount) {
        System.out.println("---You choose Credit Card payment---"+
    "\n...charging your card "+creditCardNum + "\ncode: "+ cvvCode +" with: "+
        amount + " USD");

        return amount + " USD transferred";
    }
}
