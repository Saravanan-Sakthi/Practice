package training.staticblock;

public class StaticBlockTest{



    static {
        try {
            a = 10;
            System.out.println("Inside Static");
            Thread.sleep(1);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    private static int a = 0;
    public static void test() {
        System.out.println(a);
    }
}
