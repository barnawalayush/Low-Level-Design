package pattern.design.lowLevel.structuralDesignPattern.bridgeDesignPattern.withBridgePattern;

public class Main {

    public static void main(String[] args) {

        LivingThings fishObject = new Fish(new WaterBreatheImplementation());
        fishObject.breatheProcess();
    }
}
