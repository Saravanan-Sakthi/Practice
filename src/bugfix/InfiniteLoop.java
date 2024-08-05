package bugfix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfiniteLoop {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        list.add("9876989879");
        map.put("numbers", list);
        removeSensitiveValues(map);
    }

    private static Map<String, ? > removeSensitiveValues(Map<String,?> rawMap) {
        if (rawMap == null) {
            return null;
        }
        List<String> numbers = (List<String>) rawMap.get("numbers");
        if (numbers == null) {
            return null;
        }
        for (int i = 0 ; i<numbers.size() ; i++) {
            numbers.add("changed_"+getSafeString(numbers.get(i)));
        }
        return rawMap;
    }

    private static String getSafeString(String value) {
        if (value != null) {
            return "hashed_"+value;
        }
        return value;
    }
}
