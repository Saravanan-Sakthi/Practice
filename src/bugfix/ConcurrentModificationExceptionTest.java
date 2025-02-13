package bugfix;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationExceptionTest {

    public static List<String> commonList = new ArrayList<>();

    public static void main(String[] args) {
        addElement();
        for (String a : commonList) {
            removeElement();
        }
    }

    public static void addElement() {
        commonList.add("Hello1");
    }

    public static void removeElement() {
        commonList.remove("Hello1");
    }
}
