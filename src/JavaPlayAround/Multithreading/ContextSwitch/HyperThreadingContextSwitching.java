package JavaPlayAround.Multithreading.ContextSwitch;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HyperThreadingContextSwitching {
    public static void main(String[] args) {
        // Create a thread pool with 32 threads (based on a system with 16 cores and hyperthreading)
        ExecutorService threadPool = Executors.newFixedThreadPool(32);

        // Simulating 1000 tasks to be executed concurrently
        for (int i = 0; i < 1000; i++) {
            final int taskNumber = i;
            threadPool.execute(() -> {
                // Simulating a CPU-bound or I/O-bound task
                processTask(taskNumber);
            });
        }

        // Shutdown the thread pool
        threadPool.shutdown();
    }

    public static void processTask(int taskNumber) {
        System.out.println("Processing task " + taskNumber + " on thread " + Thread.currentThread().getName());
        try {
            // Simulate task duration
            Thread.sleep(200); // Simulating an I/O-bound or waiting operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
