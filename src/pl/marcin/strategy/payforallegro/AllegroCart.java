package pl.marcin.strategy.payforallegro;

import java.util.ArrayList;
import java.util.List;

public class AllegroCart {
    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<>();
        addToCart(itemList,new Item("bread",1.20));
        addToCart(itemList,new Item("meat",3.20));
        addToCart(itemList,new Item("cakes",4.30));
        payForItem(itemList,new Blik(1233));
        payForItem(itemList,new CreditCardPayment(1233,"123231313"));
        payForItem(itemList,new InternetBankTransfer("Mbank"));
        payForItem(itemList,new TraditionalTransfer("123322222"));








    }
    public static void processPaymentExecutor(PaymentForm paymentForm, double amount){
        System.out.println(paymentForm.processPayment(amount));
    }
    public static void addToCart(List<Item> itemList,Item item){
        itemList.add(item);
    }

    public static void payForItem(List<Item>itemList,PaymentForm paymentForm) {
        double amount = 0;
        for (Item item : itemList) {
            System.out.println(item);
            amount += item.getPrice();
        }
        System.out.println("Your total cost is: " + amount);
        processPaymentExecutor(paymentForm,amount);


    }


}

