package pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern;

import pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern.BasePizza;

public class Farmhouse extends BasePizza {
    @Override
    public int cost() {
        return 100;
    }
}
