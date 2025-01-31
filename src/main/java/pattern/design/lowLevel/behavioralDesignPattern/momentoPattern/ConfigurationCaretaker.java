package pattern.design.lowLevel.behavioralDesignPattern.momentoPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {

    List<ConfigurationMomento> history = new ArrayList<>();

    public void addMemento(ConfigurationMomento configurationMomento){
        history.add(configurationMomento);
    }

    public ConfigurationMomento undo(){
        if(!history.isEmpty()){
            int lastMomentoIndex = history.size() - 1;
            ConfigurationMomento lastMomento = history.get(lastMomentoIndex);
            history.remove(lastMomentoIndex);
            return lastMomento;
        }
        return null;
    }
}
