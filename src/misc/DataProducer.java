package misc;

import org.json.JSONObject;

public class DataProducer {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        int a  = json.optInt("hello");
        System.out.println(a);
    }


}
