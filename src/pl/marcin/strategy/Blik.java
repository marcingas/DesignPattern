package pl.marcin.strategy;

public class Blik implements PaymentForm{
    private int blikCode;

    public Blik(int blikCode) {
        this.blikCode = blikCode;
    }

    @Override
    public String processPayment(double amount) {
        return "Accepting your Blik code "+blikCode+"..., " + amount + " amount transfered";
    }
}
