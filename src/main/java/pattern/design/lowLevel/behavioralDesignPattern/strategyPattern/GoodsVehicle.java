package pattern.design.lowLevel.behavioralDesignPattern.strategyPattern;

import pattern.design.lowLevel.behavioralDesignPattern.strategyPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
