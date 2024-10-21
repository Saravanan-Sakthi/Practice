package io;

import java.io.IOException;
import java.io.InputStream;

public class StreamPrinter {
    private InputStream input;

    public StreamPrinter (InputStream input) {
        this.input = input;
    }

    public static void main(String[] args) {
        StreamPrinter printer = new StreamPrinter(System.in);
        printer.print();
    }

    public void print() {
        try {
            while (true) {
                int in = input.read();
                if (in == -1) {
                    break;
                }
                System.out.write(in);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
