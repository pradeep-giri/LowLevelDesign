package DesignPatterns.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observerList;
    private float temperature;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(float data) {
        temperature = data;
        notifyObservers();
    }

    @Override
    public float getData() {
        return temperature;
    }
}
