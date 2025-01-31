package pattern.design.lowLevel.behavioralDesignPattern.nullObjectPattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String vehicleType){
        if("Car".equals(vehicleType)){
            return new Car();
        }
        return new Null();
    }
}
