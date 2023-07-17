package pl.marcin.observer;

public class ObserverPatternMain {
    public static void main(String[] args) {
        Order order = new Order(110L,OrderStatus.ZAREJESTROWANE);

        SMS sms = new SMS();
        TextMessage textMessage = new TextMessage();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(sms);
        order.registerObserver(email);

        order.notifyObservers();

        order.changeOrderStatus(OrderStatus.WYSŁANE);
        order.unregisterObserver(email);
        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }



}
