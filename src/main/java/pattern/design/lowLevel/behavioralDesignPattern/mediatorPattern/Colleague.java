package pattern.design.lowLevel.behavioralDesignPattern.mediatorPattern;

public interface Colleague {

    void placeBid(int bidAmount);
    void receiveNotification(int bidAmount);
    String getName();

}
