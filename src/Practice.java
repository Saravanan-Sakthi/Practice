import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/saravanan-12380/saro/cdpcodenotes/testing/testjson.txt"))) {
//            String line = reader.readLine();
//            System.out.println(line);
//            JSONObject json = new JSONObject(line);
//            System.out.println(json);
//        } catch (IOException e){
//            System.out.println(e);
//        }


        Map<String,String> testMap = new HashMap<>();
        String value = testMap.get("vb");
        if (value == null) {
            System.out.println("Null in value");
        }
    }
}
