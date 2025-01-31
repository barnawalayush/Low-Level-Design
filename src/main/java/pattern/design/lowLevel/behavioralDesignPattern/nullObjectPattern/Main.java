package pattern.design.lowLevel.behavioralDesignPattern.nullObjectPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        if(vehicle != null){
            System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
            System.out.println("Tank Capacity: " + vehicle.getTankCapacity());
        }
    }
}
