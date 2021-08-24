package thread.producerconsumer;

public class ProducerConsummerDriver {
    public static void main(String[] args) {
        Consumer obj1= new Consumer();
        Thread consumer= new Thread(obj1);
        consumer.setName("Consumer");
        consumer.start();
        Producer obj = new Producer();
        Thread producer= new Thread(obj);
        producer.setName("Producer thread");
        producer.start();
    }
}
