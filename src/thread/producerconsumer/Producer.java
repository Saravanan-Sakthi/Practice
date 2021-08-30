package thread.producerconsumer;


public class Producer implements Runnable{

    @Override
    public void run() {
        loadList();
    }

    private void loadList() {
        synchronized (this) {
            while (true) {
                while (Inventory.list.size() == 10) {

                    try {
                        this.wait(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                Inventory.list.add(new Integer(500));
                System.out.println(Thread.currentThread().getName() + " thread loaded list size = "+Inventory.list.size());
            }
        }
    }
}
