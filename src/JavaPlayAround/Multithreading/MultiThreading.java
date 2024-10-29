package JavaPlayAround.Multithreading;

public class MultiThreading implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
