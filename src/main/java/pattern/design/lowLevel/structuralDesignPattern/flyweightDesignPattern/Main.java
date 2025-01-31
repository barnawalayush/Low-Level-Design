package pattern.design.lowLevel.structuralDesignPattern.flyweightDesignPattern;

public class Main {

    public static void main(String[] args) {

        IRobot humanoidRobot = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot.display(1,4);
    }
}
