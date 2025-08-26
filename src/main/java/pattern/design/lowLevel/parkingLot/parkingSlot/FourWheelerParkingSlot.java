package pattern.design.lowLevel.parkingLot.parkingSlot;

import pattern.design.lowLevel.parkingLot.entities.VehicleType;

public class FourWheelerParkingSlot extends ParkingSlot {
    public FourWheelerParkingSlot(String slotId, int price, VehicleType vehicleType) {
        this.setSlotId(slotId);
        this.setPrice(price);
        this.setOccupied(false);
        this.setVehicleType(vehicleType);
    }
}
