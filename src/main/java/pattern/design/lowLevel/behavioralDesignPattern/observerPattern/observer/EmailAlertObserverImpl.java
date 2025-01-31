package pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observer;

import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock, Hurry Up!!");
    }

    private void sendEmail(String emailId, String s) {
        System.out.println("mail sent to: " + emailId);
    }


}
