package pattern.design.lowLevel.behavioralDesignPattern.nullObjectPattern;

public class Car implements Vehicle{


    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
