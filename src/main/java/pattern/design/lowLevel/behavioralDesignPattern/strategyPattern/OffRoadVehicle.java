package pattern.design.lowLevel.behavioralDesignPattern.strategyPattern;

import pattern.design.lowLevel.behavioralDesignPattern.strategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
