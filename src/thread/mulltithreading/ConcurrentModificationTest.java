package thread.mulltithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentModificationTest {

    public static List<String> list = new ArrayList<>();

    public void add(String a) {
        list.add(a);
    }

    public void print(){
            for(String a : list) {
                System.out.println(a);
            }
    }

    public static void main(String[] args) {
        ConcurrentModificationTest test = new ConcurrentModificationTest();
        for (int i = 0 ; i<10 ; i++) {
            Thread thread1 = new Thread(()-> {
                for (int j = 0;j<10;j++) {
                    test.add(String.valueOf(j));
                }
                ConcurrentModificationTest.list = new ArrayList<>();
            });
            Thread thread2 = new Thread(()-> {
                for (int j = 0;j<10;j++) {
                    test.print();
                }
            });
            thread1.start();
            thread2.start();
        }
    }

}
