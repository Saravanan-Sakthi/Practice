package training.staticblock;

public class TestRunner {
    public static void main(String[] args) {
        //System.out.println(Child.name);

        for (int i = 0 ; i < 3 ; i++) {
            Thread thread = new Thread(
                    () -> {
                        StaticBlockTest.test();
                    }
            );
            thread.start();
        }
    }
}
