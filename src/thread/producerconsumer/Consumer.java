package thread.producerconsumer;

import java.util.List;

public class Consumer implements Runnable{
    static List<Object> list = Producer.list;
    @Override
    public void run() {
        unloadList();
    }

    private void unloadList() {
        while (true){
            list.remove(0);
            System.out.println(Thread.currentThread().getName()+" Unloaded");
        }
    }
}
