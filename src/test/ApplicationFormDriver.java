package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationFormDriver {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        List<ApplicationForm> forms = new ArrayList<>();
        while (true) {
            System.out.println("1. New registration\n2. Check details\n3. Edit details\n-1. Exit\nEnter choice to proceed : ");
            int option = scan.nextInt();
            scan.nextLine();
            if (option == 1) {
                ApplicationForm form = register();
                forms.add(form);
                System.out.println("This is your id : "+forms.indexOf(form));
            }
            if (option == 2) {
                System.out.println("Enter your id : ");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.println(forms.get(id));
            }
            if (option == 3) {
                System.out.println("Enter your id : ");
                int id = scan.nextInt();
                scan.nextLine();
                ApplicationForm form = forms.get(id);
                edit(form);
                System.out.println("Edited successfully");
            }
            if (option == -1) {
                System.out.println("Thank you, bye");
                break;
            }
            System.out.println("\n");
        }
    }

    private static boolean checkEdit(String param) {
        System.out.println("Edit "+param+" ? (yes/no) : ");
        String consent =  scan.nextLine();
        return  "yes".equalsIgnoreCase(consent);
    }
    private static void edit(ApplicationForm form) {
        if (checkEdit("Name")) {
            System.out.println("Enter you name : ");
            form.name = scan.nextLine();
        }
        if (checkEdit("Course")) {
            System.out.println("Enter course : ");
            form.course = scan.nextLine();
        }
        if (checkEdit("Marks")) {
            System.out.println("Enter marks : ");
            form.marks = scan.nextLine();
        }
        if (checkEdit("Age")) {
            System.out.println("Enter your age : ");
            form.age = scan.nextInt();
        }
    }

    private static ApplicationForm register() {
        ApplicationForm form = new ApplicationForm();
        System.out.println("Enter you name : ");
        form.name = scan.nextLine();
        System.out.println("Enter course : ");
        form.course = scan.nextLine();
        System.out.println("Enter marks : ");
        form.marks = scan.nextLine();
        System.out.println("Enter your age : ");
        form.age = scan.nextInt();
        return form;
    }
}
