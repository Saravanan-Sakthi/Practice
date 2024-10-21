package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IOPlayground {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/Users/saravanan-12380/saro/practice/testfile.txt")) {
            int n;
            while ((n = fis.available()) > 0) {
                byte [] b = new byte[n];
                fis.read(b);
                String s = new String(b);
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
