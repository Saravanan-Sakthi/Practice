package thread.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
    static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        Producer obj = new Producer();
        Thread producer= new Thread(obj);
        producer.setName("Producer thread");
        producer.start();
        Consumer obj1= new Consumer();
        Thread consumer= new Thread(obj1);
        consumer.setName("Consumer");
        consumer.start();
    }

    @Override
    public void run() {
        loadList();
    }

    private void loadList() {
        while(true) {
            list.add(new Object());
            System.out.println(Thread.currentThread().getName()+" loaded");
        }
    }
}
