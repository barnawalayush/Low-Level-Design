package pattern.design.lowLevel.behavioralDesignPattern.chainOfResponsibilityPattern;

public abstract class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor nextLoggerProcessor;

    public LogProcessor(LogProcessor loggerProcessor) {
        this.nextLoggerProcessor = loggerProcessor;
    }

    public void log(int level, String message){
        if(nextLoggerProcessor != null){
            nextLoggerProcessor.log(level, message);
        }
    }
}
