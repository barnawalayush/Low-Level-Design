package pattern.design.lowLevel.parkingLot.parkingSlot;

import pattern.design.lowLevel.parkingLot.entities.VehicleType;

public class TwoWheelerParkingSlot extends ParkingSlot {
    public TwoWheelerParkingSlot(String slotId, int price, VehicleType vehicleType) {
        this.setSlotId(slotId);
        this.setPrice(price);
        this.setOccupied(false);
        this.setVehicleType(vehicleType);
    }
}
