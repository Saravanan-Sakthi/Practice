package thread.mulltithreading;

import thread.producerconsumer.Inventory;

import java.util.concurrent.CountDownLatch;

public class WorkerThread implements Runnable{

    private String name;

    private CountDownLatch latch = null;
    public WorkerThread (CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0 ; i<10 ; i++) {
            Inventory.workers.add(name);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
        }
        latch.countDown();
    }
}
