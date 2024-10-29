package JavaPlayAround.Multithreading;

public class Main {
    public static void main(String[] args) {

//        // MultiThreading
//        System.out.println("Going inside the main method: " + Thread.currentThread().getName());
//        MultiThreading runnableObj = new MultiThreading();
//        Thread thread1 = new Thread(runnableObj);
//        thread1.start();
//        System.out.println("Finish main method: " + Thread.currentThread().getName());

        // MonitorLck
        MonitorLock lock = new MonitorLock();
        Thread t1 = new Thread(() -> {lock.task1();});
        Thread t2 = new Thread(() -> {lock.task2();});
        Thread t3 = new Thread(() -> {lock.task3();});

        t1.start();
        t2.start();
        t3.start();
    }
}
