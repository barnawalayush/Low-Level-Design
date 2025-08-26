package pattern.design.lowLevel.parkingLot.parkingSlot;

import lombok.Getter;
import pattern.design.lowLevel.parkingLot.entities.Vehicle;
import pattern.design.lowLevel.parkingLot.parkingSlot.parkingSLotStrategy.ParkingSlotStrategy;

import java.util.List;

@Getter
public class ParkingSlotManager {

    List<ParkingSlot> parkingSlots;
    ParkingSlotStrategy strategy;

    public ParkingSlotManager(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot getAvailableSlot(ParkingSlotStrategy strategy, Vehicle vehicle) {
        return strategy.getParkingSlot(vehicle);
    }

    public void addParkingSlot(ParkingSlot slot) {
        parkingSlots.add(slot);
    }

    public void removeParkingSlot(ParkingSlot slot) {
        parkingSlots.remove(slot);
    }

    public void BookSlot(ParkingSlot slot, Vehicle vehicle) {
        slot.parkVehicle(vehicle);
        System.out.println("Booked slot: " + slot.getSlotId() + " for vehicle: " + vehicle.getVehicleNumber());
    }

    public void unBookSlot(ParkingSlot slot) {
        slot.removeVehicle();
        System.out.println("UnBooked slot: " + slot.getSlotId() + " for vehicle: " + slot.getVehicle().getVehicleNumber());
    }
}
