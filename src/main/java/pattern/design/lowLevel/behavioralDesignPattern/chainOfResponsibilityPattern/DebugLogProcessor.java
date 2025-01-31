package pattern.design.lowLevel.behavioralDesignPattern.chainOfResponsibilityPattern;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == 2){
            System.out.println("DEBUG: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
