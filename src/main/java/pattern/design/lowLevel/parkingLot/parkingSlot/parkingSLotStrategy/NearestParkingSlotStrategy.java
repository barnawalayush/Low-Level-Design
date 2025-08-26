package pattern.design.lowLevel.parkingLot.parkingSlot.parkingSLotStrategy;

import pattern.design.lowLevel.parkingLot.entities.Vehicle;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlot;

import java.util.List;

public class NearestParkingSlotStrategy extends ParkingSlotStrategy {

    NearestParkingSlotStrategy(List<ParkingSlot> parkingSlots) {
        super(parkingSlots);
    }

    @Override
    public ParkingSlot getParkingSlot(Vehicle vehicle) {
        // Implement nearest slot finding logic here
        return null;
    }
}
