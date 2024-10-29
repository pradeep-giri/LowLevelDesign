package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class WarnLogProcessor extends LogProcessor{

    WarnLogProcessor(LogProcessor next) {
        super(next);
    }

    public void log(int level, String message) {
        if(level == WARN) {
            System.out.println("WARN: " + message);
        } else {
            super.log(level, message);
        }
    }
}
