package pattern.design.lowLevel.behavioralDesignPattern.chainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "error throws");


    }
}
