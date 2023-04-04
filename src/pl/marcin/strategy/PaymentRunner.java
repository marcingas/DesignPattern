package pl.marcin.strategy;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentForm blik = new Blik();
        PaymentForm creditCard = new CreditCardPayment();
        PaymentForm internetBankTransfer = new InternetBankTransfer();

        processPaymentPrinter(blik,300);
        processPaymentPrinter(creditCard,300);
        processPaymentPrinter(internetBankTransfer,300);



    }
    public static void processPaymentPrinter(PaymentForm paymentForm, int amount){
        System.out.println(paymentForm.processPayment(amount));
    }


}

