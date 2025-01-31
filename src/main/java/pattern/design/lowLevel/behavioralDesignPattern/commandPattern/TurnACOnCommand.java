package pattern.design.lowLevel.behavioralDesignPattern.commandPattern;

public class TurnACOnCommand implements ICommand{

    AirConditioner airConditioner;

    public TurnACOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOn();
    }
}
