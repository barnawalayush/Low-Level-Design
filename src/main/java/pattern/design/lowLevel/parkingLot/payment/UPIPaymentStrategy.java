package pattern.design.lowLevel.parkingLot.payment;

public class UPIPaymentStrategy extends PaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Payment done using UPI: " + amount);
    }
}
