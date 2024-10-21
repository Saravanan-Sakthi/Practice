package bugfix;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JSONMutation {

    private static class Person{
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private int age;
        private int id;
    }

    public static Map<Integer, Person> dataMap = new HashMap<>();

    public static void main(String[] args) {
        initData();
        JSONObject json = new JSONObject();
        json.put("id",3);
        json.put("name", "Akka");
        json.put("age", 21);
        updateData(json);
        System.out.println(dataMap);
    }

    private static void initData() {
        Person a = new Person();
        a.setName("Saravanan");
        a.setAge(24);
        a.setId(1);
        dataMap.put(1, a);
        a= new Person();
        a.setName("Akalya");
        a.setAge(27);
        a.setId(2);
        dataMap.put(2, a);
        a= new Person();
        a.setName("Sandhiya");
        a.setAge(24);
        a.setId(3);
        dataMap.put(3, a);
    }

    private static void updateData(JSONObject updateData) {
        logData(updateData);
        String id = updateData.optString("id");
        Person person = dataMap.get(id);
        if (updateData.has("name")) {
            person.setName(updateData.optString("name"));
        }
        if (updateData.has("age")) {
            person.setAge(updateData.optInt("age"));
        }
    }

    private static void logData(JSONObject updateData) {
        JSONObject loggableData = new JSONObject();
        String id = updateData.optString("id");
        Set<String> keySet = updateData.keySet();
        keySet.remove("id");
        loggableData.put(id, keySet);
        System.out.println(loggableData);
    }
}
