package pl.marcin.strategy.banktransfer;

public class InternetBankTransfer implements PaymentForm {
    private String bankName;

    public InternetBankTransfer(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String processPayment(double amount) {
        System.out.println("----You choose internetBankTransfer----- \nredirectiong to your bank account " + bankName);


        return "...please log in to your account and accept amount: " +
                amount + " USD";
    }
}
