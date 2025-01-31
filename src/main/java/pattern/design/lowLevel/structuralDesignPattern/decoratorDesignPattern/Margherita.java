package pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern;

import pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern.BasePizza;

public class Margherita extends BasePizza {
    @Override
    public int cost() {
        return 150;
    }
}
