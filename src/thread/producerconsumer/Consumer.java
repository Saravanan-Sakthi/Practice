package thread.producerconsumer;

public class Consumer implements Runnable{
    @Override
    public void run() {
        new Inventory().unloadList();
    }


}
