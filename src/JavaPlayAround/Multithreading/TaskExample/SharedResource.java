package JavaPlayAround.Multithreading.TaskExample;

public class SharedResource {
    boolean itemAvailable = false;

    // synchronized puts the monitor lock
    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking all threads which are waiting.");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("ConsumeIem method is invoked by: " + Thread.currentThread().getName());

        // Using while loop to avoid "Spurious wake-up", sometimes because of system noise
        while (!itemAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now.");
                wait(); // it releases the monitor lock
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
