package inheritance;

public class Parent {

    public static String name = "Test String";

    static{
        System.out.println("Parent static");
    }

    public Parent(int a) {

    }

    private void privateTest() {

    }
    public void printMessage(){
        System.out.println("Inside parent");
    }

    public void testMethod() {
        System.out.println("parent");
    }
}
