package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int WARN = 2;
    public static int ERROR = 3;
    public static int DEBUG = 4;

    LogProcessor nextProcessor;

    LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void log(int logLevel, String message) {
        if(nextProcessor != null) {
            nextProcessor.log(logLevel, message);
        }
    }
}
