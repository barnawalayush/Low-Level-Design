package pattern.design.lowLevel.parkingLot.entryGate;

import pattern.design.lowLevel.parkingLot.parkingSlot.parkingSLotStrategy.DefaultParkingSlotStrategy;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlot;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlotManager;
import pattern.design.lowLevel.parkingLot.parkingSlot.parkingSLotStrategy.ParkingSlotStrategy;
import pattern.design.lowLevel.parkingLot.entities.Ticket;
import pattern.design.lowLevel.parkingLot.entities.Vehicle;

public class EntranceGate {
    private final String gateId;
    private final ParkingSlotManager parkingSlotManager;

    public EntranceGate(String gateId, ParkingSlotManager parkingSlotManager) {
        this.gateId = gateId;
        this.parkingSlotManager = parkingSlotManager;
    }

    public Ticket issueTicket(Vehicle vehicle) {
        ParkingSlotStrategy strategy = new DefaultParkingSlotStrategy(parkingSlotManager.getParkingSlots());
        ParkingSlot slot = parkingSlotManager.getAvailableSlot(strategy ,vehicle);
        if (slot != null) {
            slot.parkVehicle(vehicle);
            System.out.println("Ticket issued for vehicle: " + vehicle.getVehicleNumber() + " at slot: " + slot.getSlotId());
            return new Ticket(System.currentTimeMillis(), slot);
        }
        System.out.println("No available slot for vehicle type: " + vehicle.getVehicleType());
        return null; // No available slot
    }

}
