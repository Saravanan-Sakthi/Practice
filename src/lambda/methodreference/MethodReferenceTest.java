package lambda.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceTest {
    public static void main(String[] args) {
        BiFunction<String, String , Integer> ref = String::indexOf;
        int ans = ref.apply("", "");
        Function<String , String > id = Function.identity();
        System.out.println(id.apply("hello"));
    }
    private static String getString() {
        return "String";
    }
}
