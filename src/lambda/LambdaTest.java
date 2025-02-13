package lambda;

import interfacetest.FunctionalInterface;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTest {
    public static void main(String[] args) {
//        int a = 10;
//        //a += 1;
//        FunctionalInterface lambda = (b) -> {System.out.println("Lambda called "+(a+b));};
//        lambda.function(4);
//        System.out.println();
//
//        Consumer<String> consumer = LambdaTest::print;
//        String [] array = new String[] {"saravanan", "akalya", "sandhiya", null, null};
//        List<String> list = new ArrayList<>(Arrays.asList(array));
//        System.out.println(list);
//        list.add("paangi");
//        Predicate<String> predicate = s -> s==null;
//        list.removeIf(predicate);
//        list.forEach(consumer);

        test(() ->  new Object());
        test(() ->  new Object());
        test(() ->  new Object());

    }
private static Supplier function;
    private static void test(Supplier f) {
        if (function == f) {
            System.out.println("same");
        }
        function = f;
    }

    private static void print(String a) {
        System.out.println(a);
    }
}
