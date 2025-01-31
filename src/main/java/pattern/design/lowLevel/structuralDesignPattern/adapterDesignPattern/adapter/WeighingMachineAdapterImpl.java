package pattern.design.lowLevel.structuralDesignPattern.adapterDesignPattern.adapter;

import pattern.design.lowLevel.structuralDesignPattern.adapterDesignPattern.adaptee.WeighingMachine;

public class WeighingMachineAdapterImpl implements WeighingMachineAdapter{

    WeighingMachine weighingMachine;

    public WeighingMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInkG() {
        double weightInPound = weighingMachine.getWeightInPound();

        return weightInPound * .45;
    }
}
