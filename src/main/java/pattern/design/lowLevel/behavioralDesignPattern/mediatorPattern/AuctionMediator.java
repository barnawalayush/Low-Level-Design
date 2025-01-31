package pattern.design.lowLevel.behavioralDesignPattern.mediatorPattern;

public interface AuctionMediator {

    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
    void getAllColleague();
}
