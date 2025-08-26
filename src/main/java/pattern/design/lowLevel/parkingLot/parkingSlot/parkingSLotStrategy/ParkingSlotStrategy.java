package pattern.design.lowLevel.parkingLot.parkingSlot.parkingSLotStrategy;

import pattern.design.lowLevel.parkingLot.entities.Vehicle;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlot;

import java.util.List;

public abstract class ParkingSlotStrategy {
    List<ParkingSlot> parkingSlots;

    ParkingSlotStrategy(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public abstract ParkingSlot getParkingSlot(Vehicle vehicle);
}
