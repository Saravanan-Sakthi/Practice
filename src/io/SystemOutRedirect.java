package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class SystemOutRedirect {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("/Users/saravanan-12380/saro/practice/testfile.txt")) {
            PrintStream out = new PrintStream(outputStream);
            System.setOut(out);
            System.out.println("Hello World");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
