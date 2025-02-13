import bugfix.InfiniteLoop;
import org.json.JSONObject;

import java.util.*;

public class Abc {

    private static Map<String, Long> hashMap = new HashMap<>();
    public static void main(String [] inputs){
        hashMap.put("Hello", null);
        System.out.println(getValue());
        //System.out.println("hello");
    }

    private static long getValue() {
        return hashMap.get("Hello");
    }
}
