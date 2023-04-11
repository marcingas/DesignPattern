package pl.marcin.strategy.payforallegro;

public class Blik implements PaymentForm {
    private int blikCode;

    public Blik(int blikCode) {
        this.blikCode = blikCode;
    }

    @Override
    public String processPayment(double amount) {
        System.out.println("----You choose BLIK---- \nAccepting your Blik code: " + blikCode + " ...");

        return "amount: " + amount + " USD transfered";
    }
}
