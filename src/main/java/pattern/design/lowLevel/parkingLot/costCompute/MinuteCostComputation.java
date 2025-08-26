package pattern.design.lowLevel.parkingLot.costCompute;

import pattern.design.lowLevel.parkingLot.entities.Ticket;

public class MinuteCostComputation extends CostComputation{
    public int computeCost(Ticket ticket) {
        long entryTime = ticket.getEntryTime();
        long exitTime = entryTime + 3660000;
        long duration = exitTime - entryTime;
        int minutes = (int) Math.ceil((double) duration / 60000);
        System.out.println("Minutes: " + minutes);
        return minutes * ticket.getParkingSlot().getPrice();
    }
}
