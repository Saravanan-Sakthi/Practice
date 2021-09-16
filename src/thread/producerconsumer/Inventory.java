package thread.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public static List <Integer> list = new ArrayList<>();

    public static synchronized void loadList() {
                while (Inventory.list.size() <= 10) {
//
//                    try {
//                        this.wait(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                }
                Inventory.list.add(new Integer(500));
                System.out.println(Thread.currentThread().getName() + " thread loaded list size = "+Inventory.list.size());
            }
    public static synchronized void unloadList() {
                while (Inventory.list.size() >= 0) {
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
