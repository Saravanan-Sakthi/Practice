package lambda;

import interfacetest.FunctionalInterface;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaTest {
    public static void main(String[] args) {
        int a = 10;
        //a += 1;
        FunctionalInterface lambda = (b) -> {System.out.println("Lambda called "+(a+b));};
        lambda.function(4);
        System.out.println();

        Consumer<String> consumer = LambdaTest::print;
        String [] array = new String[] {"saravanan", "akalya", "sandhiya", null, null};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        list.add("paangi");
        Predicate<String> predicate = s -> s==null;
        list.removeIf(predicate);
        list.forEach(consumer);

    }

    private static void print(String a) {
        System.out.println(a);
    }
}
