package pattern.design.lowLevel.behavioralDesignPattern.nullObjectPattern;

public class Null implements Vehicle {

    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
