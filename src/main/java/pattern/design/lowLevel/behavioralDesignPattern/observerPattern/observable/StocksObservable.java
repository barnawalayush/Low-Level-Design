package pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observable;

import pattern.design.lowLevel.behavioralDesignPattern.observerPattern.observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber();

    public void setStockCount(int newStockAdded);

    public int getStockCount();
}
