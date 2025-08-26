package pattern.design.lowLevel.parkingLot;

import pattern.design.lowLevel.parkingLot.costCompute.CostComputation;
import pattern.design.lowLevel.parkingLot.costCompute.HourlyCostComputation;
import pattern.design.lowLevel.parkingLot.costCompute.MinuteCostComputation;
import pattern.design.lowLevel.parkingLot.entities.Ticket;
import pattern.design.lowLevel.parkingLot.entities.Vehicle;
import pattern.design.lowLevel.parkingLot.entities.VehicleType;
import pattern.design.lowLevel.parkingLot.entryGate.EntranceGate;
import pattern.design.lowLevel.parkingLot.exitGate.ExitGate;
import pattern.design.lowLevel.parkingLot.parkingSlot.FourWheelerParkingSlot;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlot;
import pattern.design.lowLevel.parkingLot.parkingSlot.ParkingSlotManager;
import pattern.design.lowLevel.parkingLot.parkingSlot.TwoWheelerParkingSlot;
import pattern.design.lowLevel.parkingLot.payment.CashPaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parking Lot System");

        List<ParkingSlot> parkingSlots = initializeParkingSlots();

        ParkingSlotManager manager = new ParkingSlotManager(parkingSlots);
        System.out.println("Total Parking Slots: " + manager.getParkingSlots().size());

        Vehicle vehicle1 = new Vehicle("KA-01-12345", VehicleType.TWO_WHEELER);
        Vehicle vehicle2 = new Vehicle("KA-01-12346", VehicleType.TWO_WHEELER);
        Vehicle vehicle3 = new Vehicle("KA-01-12347", VehicleType.TWO_WHEELER);
        Vehicle vehicle4 = new Vehicle("KA-01-12348", VehicleType.TWO_WHEELER);
        Vehicle vehicle5 = new Vehicle("KA-01-12349", VehicleType.TWO_WHEELER);
        Vehicle vehicle6 = new Vehicle("KA-01-12341", VehicleType.TWO_WHEELER);

        Vehicle vehicle7 = new Vehicle("KA-01-54322", VehicleType.FOUR_WHEELER);

        EntranceGate entranceGate = new EntranceGate("1", manager);
        Ticket ticket1 = entranceGate.issueTicket(vehicle1);
        if(ticket1!=null){
            System.out.println("Ticket Issued for vehicle: " + vehicle1.getVehicleNumber() + " at slot: " + ticket1.getParkingSlot().getSlotId());
        } else {
            System.out.println("No available slot for vehicle: " + vehicle1.getVehicleNumber());
        }

        Ticket ticket2 = entranceGate.issueTicket(vehicle2);
        Ticket ticket3 = entranceGate.issueTicket(vehicle3);
        Ticket ticket4 = entranceGate.issueTicket(vehicle4);
        Ticket ticket5 = entranceGate.issueTicket(vehicle5);
        Ticket ticket6 = entranceGate.issueTicket(vehicle6);

        ExitGate exitGate = new ExitGate();
        exitGate.setCostComputation(new MinuteCostComputation());
        exitGate.setPaymentStrategy(new CashPaymentStrategy());
        int amount = exitGate.computeCost(ticket1);
        exitGate.pay(amount);


    }

    private static List<ParkingSlot> initializeParkingSlots() {
        ParkingSlot slot1 = new TwoWheelerParkingSlot("1", 20, VehicleType.TWO_WHEELER);
        ParkingSlot slot2 = new TwoWheelerParkingSlot("2", 20, VehicleType.TWO_WHEELER);
        ParkingSlot slot3 = new TwoWheelerParkingSlot("3", 20, VehicleType.TWO_WHEELER);
        ParkingSlot slot4 = new TwoWheelerParkingSlot("4", 20, VehicleType.TWO_WHEELER);
        ParkingSlot slot5 = new TwoWheelerParkingSlot("5", 20, VehicleType.TWO_WHEELER);
        ParkingSlot slot6 = new FourWheelerParkingSlot("1", 50, VehicleType.FOUR_WHEELER);
        ParkingSlot slot7 = new FourWheelerParkingSlot("2", 50, VehicleType.FOUR_WHEELER);
        ParkingSlot slot8 = new FourWheelerParkingSlot("3", 50, VehicleType.FOUR_WHEELER);
        ParkingSlot slot9 = new FourWheelerParkingSlot("4", 50, VehicleType.FOUR_WHEELER);
        ParkingSlot slot10 = new FourWheelerParkingSlot("5", 50, VehicleType.FOUR_WHEELER);
        ParkingSlot slot11 = new FourWheelerParkingSlot("6", 50, VehicleType.FOUR_WHEELER);

        List<ParkingSlot> parkingSlots = new ArrayList<>();
        parkingSlots.add(slot1);
        parkingSlots.add(slot2);
        parkingSlots.add(slot3);
        parkingSlots.add(slot4);
        parkingSlots.add(slot5);
        parkingSlots.add(slot6);
        parkingSlots.add(slot7);
        parkingSlots.add(slot8);
        parkingSlots.add(slot9);
        parkingSlots.add(slot10);
        parkingSlots.add(slot11);

        return parkingSlots;
    }
}
