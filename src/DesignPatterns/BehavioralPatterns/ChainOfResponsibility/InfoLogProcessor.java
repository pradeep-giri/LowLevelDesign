package DesignPatterns.BehavioralPatterns.ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor {

    InfoLogProcessor(LogProcessor next) {
        super(next);
    }

    public void log(int level, String message) {
        if(level == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(level, message);
        }
    }
}
