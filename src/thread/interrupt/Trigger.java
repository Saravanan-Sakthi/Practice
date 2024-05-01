package thread.interrupt;

import java.util.HashMap;
import java.util.Map;

public class Trigger {
    private static Map<String, Boolean> triggerMap = new HashMap<>();

    public static void setTrigger(String name, boolean trigger) {
        triggerMap.put(name, trigger);
    }

    public static boolean checkTrigger(String name) {
        return triggerMap.get(name);
    }
}
