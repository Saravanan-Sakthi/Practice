package bugfix;

import java.util.HashMap;
import java.util.Map;

public class NullPointerTest {
    public static void main(String[] args) {
        Test.display();
    }
}

class Test {
    private static Test instance = new Test();
    private static Map<String, String> map = new HashMap<String, String>();
    private Test() {
        enter();
    }
        private void enter() {
        map.put("dummy1","dummy2");
    }
    public static Test getInstance() {

        return instance;
    }
    public static void display() {
        System.out.println("Key = dummy1, Value = "+map.get("dummy1"));
    }
}
