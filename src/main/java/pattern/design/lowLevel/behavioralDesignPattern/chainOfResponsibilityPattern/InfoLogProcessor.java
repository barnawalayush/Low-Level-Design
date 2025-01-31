package pattern.design.lowLevel.behavioralDesignPattern.chainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == 1){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
