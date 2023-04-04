package pl.marcin.strategy;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentForm blik = new Blik();
        PaymentForm creditCard = new CreditCardPayment();
        PaymentForm internetBankTransfer = new InternetBankTransfer();

        ProcessPaymentExecutor(blik,300);
        ProcessPaymentExecutor(creditCard,300);
        ProcessPaymentExecutor(internetBankTransfer,300);



    }
    public static void ProcessPaymentExecutor(PaymentForm paymentForm, int amount){
        System.out.println(paymentForm.processPayment(amount));
    }


}

