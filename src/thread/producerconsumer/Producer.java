package thread.producerconsumer;


public class Producer implements Runnable{

    @Override
    public void run() {
        Inventory.loadList();
    }


}
