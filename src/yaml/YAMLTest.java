package yaml;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class YAMLTest {
    public static void main(String[] args) {
        Map<String, Map<String, String>> yamlMap = null;
        try (FileInputStream inputStream = new FileInputStream("/Users/saravanan-12380/IdeaProjects/Practice/src/yaml/testfile.yml")) {
            Yaml yaml = new Yaml();
            yamlMap = yaml.load(inputStream);
        } catch (IOException e) {
            System.out.println(e);
        }
        Map<String, String> salesAccountMap = new HashMap<>();
        BiConsumer<String, Object> consumer = (key, value) -> {
            if (value != null && value instanceof Map) {
                Map<String, Object> valueMap = (Map<String, Object>) value;
                boolean isGlobal =(boolean) valueMap.get("global");
                String baseDomain = (String)valueMap.get("base_domain");
                salesAccountMap.put(key, key+baseDomain+isGlobal);
            }
        };
        yamlMap.forEach(consumer);
    }
}
