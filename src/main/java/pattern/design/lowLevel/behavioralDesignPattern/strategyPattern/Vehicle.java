package pattern.design.lowLevel.behavioralDesignPattern.strategyPattern;

import pattern.design.lowLevel.behavioralDesignPattern.strategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
