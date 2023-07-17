package pl.marcin.observer;

public class SMS implements Observer{
    @Override
    public void update(Order order){
        System.out.println("Zamówienie nr : " + order.getOrderNumber() + " status: " + order.getOrderStatus());
    }
}
