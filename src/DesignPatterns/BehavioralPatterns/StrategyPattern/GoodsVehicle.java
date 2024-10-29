package DesignPatterns.BehavioralPatterns.StrategyPattern;

import DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.DriveStrategy;
import DesignPatterns.BehavioralPatterns.StrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
