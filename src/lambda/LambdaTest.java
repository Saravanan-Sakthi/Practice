package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest {
    public static void main(String[] args) {
        // Anonymous inner class
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("another thread");
            }
        });
        th.start();

        //Lambda expression
        Thread thr = new Thread(() -> System.out.println("another thread"));
        thr.start();
        System.out.println("in main");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Anonymous inner class
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //Lambda expression
        numbers.forEach(integer -> System.out.println(integer));


        //Method reference
        numbers.forEach(System.out::println);


        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum()
        );
    }
}
