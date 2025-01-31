package pattern.design.lowLevel.behavioralDesignPattern.commandPattern;

public class RemoteControl {

    ICommand iCommand;

    public RemoteControl() {
    }

    public void setCommand(ICommand iCommand){
        this.iCommand = iCommand;
    }

    public void pressButton(){
        iCommand.execute();
    }
}
