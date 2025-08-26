package pattern.design.lowLevel.parkingLot.costCompute;

import pattern.design.lowLevel.parkingLot.entities.Ticket;

public abstract class CostComputation {
    public abstract int computeCost(Ticket ticket);
}
