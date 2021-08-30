package thread.producerconsumer;

public class Consumer implements Runnable{
    @Override
    public void run() {
        unloadList();
    }

    private void unloadList() {
        synchronized (this) {
            while (true) {
                while (Inventory.list.size() == 0) {

                    try {
                        this.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                Inventory.list.remove(0);
                System.out.println(Thread.currentThread().getName()+" unloaded current list size = "+Inventory.list.size());
            }
        }
    }
}
