package io;

import java.awt.*;
import java.io.IOException;
import java.io.OutputStream;

public class StreamedTextArea extends TextArea {

    private OutputStream outputStream = new TextAreaOutputStream();

    public StreamedTextArea() {
        this("", 0, 0, SCROLLBARS_BOTH);
    }

    public StreamedTextArea (String text) {
        this(text, 0, 0, SCROLLBARS_BOTH);
    }

    public StreamedTextArea (int rows, int columns) {
        this("", rows, columns, SCROLLBARS_BOTH);
    }

    public StreamedTextArea(String text, int rows, int columns) {
        this(text, rows, columns, SCROLLBARS_BOTH);
    }

    public StreamedTextArea(String text, int rows, int columns, int scrollBars) {
        super(text, rows, columns, scrollBars);
        setEditable(false);
    }

    class TextAreaOutputStream extends OutputStream{

        @Override
        public void write(int b) throws IOException {
            b &= 0x000000FF;
            char c = (char)b;
            append(String.valueOf(c));
        }

        @Override
        public synchronized  void write(byte[] b , int offset, int length) {
            append(new String(b, offset, length));
        }
    }

    public static void main(String[] args) {
        TextArea area = new StreamedTextArea();
    }

}
