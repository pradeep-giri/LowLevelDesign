package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor next) {
        super(next);
    }

    public void log(int level, String message) {
        if(level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(level, message);
        }
    }
}
