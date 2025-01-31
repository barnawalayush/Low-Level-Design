package pattern.design.lowLevel.behavioralDesignPattern.commandPattern;

public class AirConditioner {

    boolean isOn;
    int temperature;

    public void turnOn(){
        isOn = true;
        System.out.println("AC turned On!!");
    }

    public void turnOff(){
        isOn = false;
        System.out.println("AC turned Off!!");
    }

    public void setTemperature(int newTemperature){
        this.temperature = newTemperature;
        System.out.println("temperature changed to " + newTemperature);
    }
}
