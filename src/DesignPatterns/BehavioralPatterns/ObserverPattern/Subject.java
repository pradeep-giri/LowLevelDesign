package DesignPatterns.BehavioralPatterns.ObserverPattern;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public void setData(float data);
    public float getData();
}
