package thread.mulltithreading;

import thread.producerconsumer.Inventory;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class MultiThreadingTest {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        long startedTime = System.currentTimeMillis();
        for (int i = 0 ; i < numberOfThreads ; i++) {
            Thread thread = new Thread(new WorkerThread(latch,("Thread "+i)));
            thread.start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Arrays.asList(Inventory.workers));
        System.out.println("Time taken : "+(System.currentTimeMillis()- startedTime));
    }
}
