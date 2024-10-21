package inheritance;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        Parent muObj = new Child();
        ((Child)muObj).testMethod1();
    }
}
