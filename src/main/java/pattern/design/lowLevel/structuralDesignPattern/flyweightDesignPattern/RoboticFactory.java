package pattern.design.lowLevel.structuralDesignPattern.flyweightDesignPattern;


import java.util.HashMap;
import java.util.Map;

// For Caching
public class RoboticFactory {

    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){

        if(roboticObjectCache.containsKey(robotType)){
            return roboticObjectCache.get(robotType);
        }else{
            if(robotType == "HUMANOID"){
                Sprites humanoidSprites = new Sprites();
                IRobot humanoidObject = new HumanoidRobot(robotType, humanoidSprites);
                roboticObjectCache.put(robotType, humanoidObject);
                return humanoidObject;
            }else if(robotType == "ROBOTICDOG"){
                Sprites roboticSprites = new Sprites();
                IRobot roboticObject = new RoboticDog(robotType, roboticSprites);
                roboticObjectCache.put(robotType, roboticObject);
                return roboticObject;
            }

        }
        return null;
    }

}
