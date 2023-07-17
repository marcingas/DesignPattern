package pl.marcin.observer;

public class Email implements Observer{
    @Override
    public void update(Order order){
        System.out.println("Zamówienie nr : " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }



}
