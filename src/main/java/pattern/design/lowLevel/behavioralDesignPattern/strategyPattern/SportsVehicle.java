package pattern.design.lowLevel.behavioralDesignPattern.strategyPattern;

import pattern.design.lowLevel.behavioralDesignPattern.strategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
