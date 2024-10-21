package streamapi;

import java.util.List;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamAPITest {
    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three","four");
//        var map = strings.stream()
//                .collect(groupingBy(String::length, counting()));
//        map.forEach((key, value) -> System.out.println(key + " :: " + value));
        strings.parallelStream().forEach(System.out::println);

    }
}
