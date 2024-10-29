package DesignPatterns.CreationalPatterns.Singleton;

public class ThreadSafe {

    private static ThreadSafe instance;

    private ThreadSafe(){}

    public static synchronized ThreadSafe getInstance() {
        if (instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }

    public static ThreadSafe getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafe.class) {
                if (instance == null) {
                    instance = new ThreadSafe();
                }
            }
        }
        return instance;
    }
}
