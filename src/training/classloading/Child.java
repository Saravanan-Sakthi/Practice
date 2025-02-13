package training.classloading;

public class Child extends Parent{

    static {
        System.out.println("Child Static");
    }
}
