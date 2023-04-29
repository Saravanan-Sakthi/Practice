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
        thread1.start();
        thread2.start();
        Thread.sleep(5000);
        thread1.interrupt();
        System.out.println("Enter stop to stop thread 1 loop");
        boolean thread1Loop = scan.nextBoolean();
        thread1.setLoop(thread1Loop);
    }
}
