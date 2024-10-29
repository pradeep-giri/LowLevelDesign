package DesignPatterns.BehavioralPatterns.StrategyPattern;

import DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
