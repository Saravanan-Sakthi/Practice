import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/saravanan-12380/saro/cdpcodenotes/testing/testjson.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
            JSONObject json = new JSONObject(line);
            System.out.println(json);
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
