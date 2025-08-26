package pattern.design.lowLevel.parkingLot.entities;

import lombok.Getter;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlot;

@Getter
public class Ticket {
    private final long entryTime;
    private final ParkingSlot parkingSlot;

    public Ticket(long entryTime, ParkingSlot parkingSlot) {
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
    }
}
