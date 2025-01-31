package pattern.design.lowLevel.structuralDesignPattern.bridgeDesignPattern.withBridgePattern;

import pattern.design.lowLevel.structuralDesignPattern.bridgeDesignPattern.withBridgePattern.LivingThings;

public class Dog extends LivingThings {

    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {

    }
}
