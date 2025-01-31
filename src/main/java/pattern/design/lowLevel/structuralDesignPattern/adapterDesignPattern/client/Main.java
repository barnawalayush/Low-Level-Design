package pattern.design.lowLevel.structuralDesignPattern.adapterDesignPattern.client;

import pattern.design.lowLevel.structuralDesignPattern.adapterDesignPattern.adaptee.WeighingMachineForBabies;
import pattern.design.lowLevel.structuralDesignPattern.adapterDesignPattern.adapter.WeighingMachineAdapter;
import pattern.design.lowLevel.structuralDesignPattern.adapterDesignPattern.adapter.WeighingMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {

        WeighingMachineAdapter adapter = new WeighingMachineAdapterImpl(new WeighingMachineForBabies());
        System.out.println(adapter.getWeightInkG());

    }
}
