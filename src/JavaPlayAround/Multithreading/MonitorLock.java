package JavaPlayAround.Multithreading;

public class MonitorLock {

    public synchronized void task1() {
        // Do something
        try {
            System.out.println("Inside Task 1");
            Thread.sleep(10000);
            System.out.println("Task 1 Completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void task2() {
        System.out.println("Inside Task 2, before synchronized");
        synchronized (this) {
            System.out.println("Inside Task 2, inside synchronized");
        }
    }

    public void task3() {
        System.out.println("Inside Task 3");
    }
}
