package DesignPatterns.BehavioralPatterns.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        ObserverImpl observer = new ObserverImpl(station);
        station.registerObserver(observer);
        station.setData(20);

        station.removeObserver(observer);
        station.setData(30);
    }
}
