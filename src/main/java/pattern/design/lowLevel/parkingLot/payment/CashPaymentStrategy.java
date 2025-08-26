package pattern.design.lowLevel.parkingLot.payment;

public class CashPaymentStrategy extends PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Payment done using cash: " + amount);
    }
}
