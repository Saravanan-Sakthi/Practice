package json;

import org.json.JSONObject;

public class JSONTest {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("boolean", false);
        System.out.println(json.optBoolean("boolean"));
        if (json.optBoolean("illa")) {
            System.out.println(json.optBoolean("hello"));
        }

    }
}
