package pattern.design.lowLevel.parkingLot.costCompute;

import pattern.design.lowLevel.parkingLot.entities.Ticket;

public class HourlyCostComputation extends CostComputation{

    public int computeCost(Ticket ticket) {
        long inTime = ticket.getEntryTime();
        long outTime = inTime + 3604000;
        long duration = outTime - inTime;
        int hours = (int) Math.ceil((double) duration / 3600000);
        System.out.println("Hours: " + hours);
        return hours * ticket.getParkingSlot().getPrice();
    }
}
