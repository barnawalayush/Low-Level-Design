package pattern.design.lowLevel.structuralDesignPattern.decoratorDesignPattern;

public class Main {

    public static void main(String[] args) {

        BasePizza basePizza = new ExtraCheese(new Mushroom(new Margherita()));
        System.out.println(basePizza.cost());

    }
}
