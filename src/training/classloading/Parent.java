package training.classloading;

public class Parent {

    public static String name = "Test Name";

    static {
        System.out.println("Parent Static");
    }

}
