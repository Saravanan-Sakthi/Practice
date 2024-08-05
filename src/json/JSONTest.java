package json;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JSONTest {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("boolean", false);
        json.put("number", 2);
        System.out.println(json.optBoolean("boolean"));
        System.out.println(json.optString("number"));

        System.out.println(json.optInt("number"));
    }
}
