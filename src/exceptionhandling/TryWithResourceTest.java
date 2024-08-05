package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceTest {

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("/Users/saravanan-12380/saro/practice/testfile.txt"))) {
            reader.close();
        } catch (Exception e) {

        }
    }
}
