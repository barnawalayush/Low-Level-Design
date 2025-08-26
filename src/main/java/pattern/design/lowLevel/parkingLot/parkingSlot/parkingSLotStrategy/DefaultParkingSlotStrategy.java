package pattern.design.lowLevel.parkingLot.parkingSlot.parkingSLotStrategy;

import pattern.design.lowLevel.parkingLot.entities.Vehicle;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlot;

import java.util.List;

public class DefaultParkingSlotStrategy extends ParkingSlotStrategy {

    public DefaultParkingSlotStrategy(List<ParkingSlot> parkingSlots) {
        super(parkingSlots);
    }

    @Override
    public ParkingSlot getParkingSlot(Vehicle vehicle) {
        for(ParkingSlot slot : parkingSlots) {
            if(!slot.isOccupied() && slot.getVehicleType() == vehicle.getVehicleType()) {
                return slot;
            }
        }
        return null;
    }
}
