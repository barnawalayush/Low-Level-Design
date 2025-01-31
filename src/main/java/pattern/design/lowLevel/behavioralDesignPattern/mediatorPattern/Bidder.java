package pattern.design.lowLevel.behavioralDesignPattern.mediatorPattern;

public class Bidder implements Colleague {

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this, bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println("Bidder " + name + " gets the notification that someone has put bid amount of " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
