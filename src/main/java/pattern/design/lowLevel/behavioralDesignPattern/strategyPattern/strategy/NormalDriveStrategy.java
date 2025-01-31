package pattern.design.lowLevel.behavioralDesignPattern.strategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability!!");
    }
}
