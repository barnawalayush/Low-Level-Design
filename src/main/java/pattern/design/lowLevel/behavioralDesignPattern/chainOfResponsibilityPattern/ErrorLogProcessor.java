package pattern.design.lowLevel.behavioralDesignPattern.chainOfResponsibilityPattern;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == 3){
            System.out.println("ERROR: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
