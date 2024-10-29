package DesignPatterns.BehavioralPatterns.StrategyPattern;

import DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
