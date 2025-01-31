package pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observer;

import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable) {
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(username, "product is in stock, Hurry Up!!");
    }

    private void sendEmail(String username, String message) {
        System.out.println("mail sent to: " + username);
    }


}
