package JavaPlayAround.Multithreading.ContextSwitch;

public class TimeSlice implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                // Simulating some work
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new TimeSlice(), "Thread-1");
        Thread t2 = new Thread(new TimeSlice(), "Thread-2");

        t1.start();
        t2.start();
    }
}
