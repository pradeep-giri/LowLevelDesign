package DesignPatterns.BehavioralPatterns.NullObjectPattern;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicleObj("Car");
        printVehicleDetails(vehicle1);

        Vehicle vehicle2 = VehicleFactory.getVehicleObj("Bike");
        printVehicleDetails(vehicle2);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating Capacity : " + vehicle.getSeatingCapacity());
        System.out.println("FUel Tank Capacity : " + vehicle.getTankCapacity());
    }
}
