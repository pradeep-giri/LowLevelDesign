package JavaPlayAround.Multithreading.TaskExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method start");

        SharedResource sharedResource = new SharedResource();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            System.out.println("Producer thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
            sharedResource.addItem();
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            System.out.println("Consumer thread: " + Thread.currentThread().getName());
            sharedResource.consumeItem();
        });

        // Thread is in runnable state
        producerThread.start();
        consumerThread.start();

        System.out.println("Main method end");
    }
}
