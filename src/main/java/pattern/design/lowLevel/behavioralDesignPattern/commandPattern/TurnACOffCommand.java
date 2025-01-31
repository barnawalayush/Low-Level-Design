package pattern.design.lowLevel.behavioralDesignPattern.commandPattern;

public class TurnACOffCommand implements ICommand{

    AirConditioner airConditioner;

    public TurnACOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}
