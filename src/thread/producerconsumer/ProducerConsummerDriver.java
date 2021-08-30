package thread.producerconsumer;

public class ProducerConsummerDriver {
    public static void main(String[] args) {
        Consumer objc = new Consumer();
        Thread consumer= new Thread(objc);
        consumer.setName("Consumer");
        consumer.start();
        Producer objp = new Producer();
        Thread producer= new Thread(objp);
        producer.setName("Producer thread");
        producer.start();
    }
}
