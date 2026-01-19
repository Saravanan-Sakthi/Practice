package garbagecollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCTest {

    String a;

    public static void main(String [] abc) throws Throwable{

        //objectUI();
        autoObject();

    }

    private static class ObjectCreator implements Runnable{

        public boolean stop = false;
        private List<GCTest> list = new ArrayList<>();
        @Override
        public void run() {
            long currentTime = System.currentTimeMillis();
            while (!stop) {
                if (System.currentTimeMillis() - currentTime > 3000) {
                    list.clear();
                    sleep(1000);
                    currentTime = System.currentTimeMillis();
                } else {
                    addObjects();
                    //sleep(10);
                }
            }
        }
        private void addObjects() {
            list.add(new GCTest());
        }
        private void sleep(long time) {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void autoObject() {
        ObjectCreator creator = new ObjectCreator();
        Thread thread = new Thread(creator);
        thread.start();
        System.out.println("enter anything to stop : ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        creator.stop = true;
    }

    private static void objectUI() {
        Scanner scan= new Scanner(System.in);
        ArrayList<Object> a= new ArrayList<>();
        ArrayList<Object> b= new ArrayList<>();
        while(true){
            System.out.println("Choose option : ");
            int option= scan.nextInt();
            if(option ==1){
                System.out.println("Number of objects : ");
                int n= scan.nextInt();
                while (n-->0){
                    a.add(new GCTest());
                    //Thread.currentThread().sleep(1);

                }
            }
            else if(option==2){
                for (Object o : a) {
                    b.add(o);

                }

            }
            else if(option==3){
                a.clear();
                b.clear();
            }
            else if (option==4){
                break;
            }
        }
    }
}

