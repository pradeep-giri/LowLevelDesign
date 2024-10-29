package DesignPatterns.BehavioralPatterns.NullObjectPattern;

public class VehicleFactory {

    static Vehicle getVehicleObj(String vehicleType) {

        if(vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
