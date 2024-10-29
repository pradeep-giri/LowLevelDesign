package DesignPatterns.CreationalPatterns.Singleton;

public class EagerInitialization {

    private static final EagerInitialization instance = new EagerInitialization();

    // private constructor to avoid client applications using the constructor
    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return instance;
    }
}
