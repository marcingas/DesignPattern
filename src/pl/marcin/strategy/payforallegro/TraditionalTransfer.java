package pl.marcin.strategy.payforallegro;

public class TraditionalTransfer implements PaymentForm {
    private String accountNumber;

    public TraditionalTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String processPayment(double ammount) {
        System.out.println("----You choose traditional bank transfer---- \nplease send your money to our account: " + accountNumber +
                " \nafter we recieve money we will send your package");
        return "Thanks for being our client! ";
    }
}
