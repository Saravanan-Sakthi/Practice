package garbagecollection;

import java.util.ArrayList;
import java.util.Scanner;

public class GCTest {
    String  as="aasssss";
    double n= 2131223232;
    String hk="adddddddds";

    public static void main(String [] abc) throws Throwable{
        /*GCTest obj=new GCTest();
        GCTest obj1= new GCTest();
        obj=null;
        obj.finalize();
        System.gc();
        System.out.print("hi");  // Inorder to prevent the main thread from terminating as the GC's thread(Daemon thread) is unimportant.
        obj1=null;*/
        Scanner scan= new Scanner(System.in);
        ArrayList<Object> a= new ArrayList<>();
        ArrayList<Object> b= new ArrayList<>();
        while(true){
            System.out.print("enter: ");
            int option= scan.nextInt();
            if(option ==1){
                int n=10000;
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
    /*@Override
    protected void finalize() throws Throwable{
        System.out.print("GC called for "+ this);
    }*/
}

