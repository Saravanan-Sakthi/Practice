package thread.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable{
    static List<Object> list = new ArrayList<>();
    @Override
    public void run() {
        loadList();
    }

    private void loadList() {
        while(true) {
            list.add(new Object());
            if(list.size()==50){
                list.clear();
                Thread.currentThread().setPriority(1);
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+" loaded");
        }
    }
}
