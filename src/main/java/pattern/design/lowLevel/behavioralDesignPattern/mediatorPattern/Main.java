package pattern.design.lowLevel.behavioralDesignPattern.mediatorPattern;


public class Main {
    public static void main(String[] args) {

        AuctionMediator mediator = new Auction();
        Colleague bidder1 = new Bidder("Bob", mediator);
        Colleague bidder2 = new Bidder("Alex", mediator);

        mediator.getAllColleague();

        bidder1.placeBid(3);
        bidder2.placeBid(5);
        bidder1.placeBid(8);

    }
}