package pl.marcin.strategy;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentForm blik = new Blik(1233);
        PaymentForm creditCard = new CreditCardPayment(123,"1239131313");
        PaymentForm internetBankTransfer = new InternetBankTransfer("mbank");
        PaymentForm traditionalTransfer = new TraditionalTransfer("12135413531");

        processPaymentExecutor(blik,300);
        processPaymentExecutor(creditCard,300);
        processPaymentExecutor(internetBankTransfer,300);
        processPaymentExecutor(traditionalTransfer,500);




    }
    public static void processPaymentExecutor(PaymentForm paymentForm, int amount){
        System.out.println(paymentForm.processPayment(amount));
    }


}

