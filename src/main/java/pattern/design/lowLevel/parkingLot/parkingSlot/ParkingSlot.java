package pattern.design.lowLevel.parkingLot.parkingSlot;


import lombok.Getter;
import lombok.Setter;
import pattern.design.lowLevel.parkingLot.entities.Vehicle;
import pattern.design.lowLevel.parkingLot.entities.VehicleType;

@Getter
@Setter
public class ParkingSlot {
    private String slotId;
    private Vehicle vehicle;
    private boolean isOccupied;
    private int price;
    private VehicleType vehicleType;

    public ParkingSlot(){
        this.isOccupied = false;
        this.vehicle = null;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied) {
            this.vehicle = vehicle;
            isOccupied = true;
            return true;
        }
        return false;
    }

    public boolean removeVehicle() {
        if (isOccupied) {
            this.vehicle = null;
            isOccupied = false;
            return true;
        }
        return false;
    }


}
