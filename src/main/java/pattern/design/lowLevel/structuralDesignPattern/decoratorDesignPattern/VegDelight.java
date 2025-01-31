package pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern;

import pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 200;
    }
}
