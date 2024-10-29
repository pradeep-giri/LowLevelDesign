package DesignPatterns.BehavioralPatterns.ObserverPattern;

public class ObserverImpl implements Observer {
    private Subject subject;

    public ObserverImpl(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("Notified Temp - " + subject.getData());
    }
}
