package pattern.design.lowLevel.behavioralDesignPattern.observerPattern;

import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observable.IPhoneObservableImpl;
import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observable.StocksObservable;
import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observer.EmailAlertObserverImpl;
import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observer.MobileAlertObserverImpl;
import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iPhoneStocksObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("john@gmail.com", iPhoneStocksObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("barnawalayush", iPhoneStocksObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("Rock@gmail.com", iPhoneStocksObservable);

        iPhoneStocksObservable.add(observer1);
        iPhoneStocksObservable.add(observer2);
        iPhoneStocksObservable.add(observer3);

        iPhoneStocksObservable.setStockCount(1);

    }
}
