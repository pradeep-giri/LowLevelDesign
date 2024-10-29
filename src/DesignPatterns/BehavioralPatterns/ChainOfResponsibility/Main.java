package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new WarnLogProcessor(new ErrorLogProcessor(null))));

        logProcessor.log(LogProcessor.DEBUG, "Printing the debug");
    }
}