package thread.interrupt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InterruptDriver {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        InterruptibleClass thread1 = new InterruptibleClass();
        thread1.setName("Thread 1");
        thread1.setLoop(true);
        InterruptibleClass thread2 = new InterruptibleClass();
        thread2.setName("Thread 2");
        thread2.setLoop(true);
        Thread thread1Thread = new Thread(thread1);
        thread1Thread.start();
        //new Thread(thread2).start();
        //Thread.sleep(5000);
        thread1Thread.interrupt();
        System.out.println("enter anything to stop Thread 1");
        scan.nextLine();
        Trigger.setTrigger(thread1.getName(), false);
        /*System.out.println("enter anything to stop Thread 2");
        scan.nextLine();
        Trigger.setTrigger(thread2.getName(), false);*/

        String a = "Pradeep";
        String b = new String("Pradeep");
    }
}
