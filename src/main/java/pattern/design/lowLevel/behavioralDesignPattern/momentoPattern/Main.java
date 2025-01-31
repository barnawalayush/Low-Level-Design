package pattern.design.lowLevel.behavioralDesignPattern.momentoPattern;

public class Main {

    public static void main(String[] args) {

        ConfigurationCaretaker caretakerObject = new ConfigurationCaretaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(3, 5);

        ConfigurationMomento snapshot1 = originator.createMomento();
        caretakerObject.addMemento(snapshot1);

        originator.setHeight(6);
        originator.setWidth(8);

        ConfigurationMomento snapshot2 = originator.createMomento();
        caretakerObject.addMemento(snapshot2);

        originator.setHeight(2);
        originator.setWidth(4);

        ConfigurationMomento restoredMomento = caretakerObject.undo();
        originator.restoreMomento(restoredMomento);

        System.out.println(originator.getHeight() + "  " + originator.getWidth());
    }
}
