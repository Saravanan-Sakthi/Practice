package bugfix;

import java.util.Scanner;

public class InputLoss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        testRun(scan);
        testRun(scan);
    }
    public static void testRun(Scanner scan) {
        System.out.println("Enter name : ");
        String name = scan.nextLine();
        System.out.println("Enter age : ");
        int age = scan.nextInt();
        System.out.println("Hello ");
        System.out.print(name);
        System.out.print(", your age is : ");
        System.out.println(age);
    }
}
