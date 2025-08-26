package pattern.design.lowLevel.parkingLot.exitGate;

import lombok.Setter;
import pattern.design.lowLevel.parkingLot.costCompute.CostComputation;
import pattern.design.lowLevel.parkingLot.entities.Ticket;
import pattern.design.lowLevel.parkingLot.payment.PaymentStrategy;

@Setter
public class ExitGate {
    PaymentStrategy paymentStrategy;
    CostComputation costComputation;

    public int computeCost(Ticket ticket) {
        return costComputation.computeCost(ticket);
    }

    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
