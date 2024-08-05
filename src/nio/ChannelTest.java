package nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("/Users/saravanan-12380/saro/practice/testfile.txt","rw");
        FileChannel channel = file.getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(2);
        int bytes = channel.read(buffer);
        while (bytes != -1) {
            System.out.println("Read " + bytes);
            buffer.flip();

            while(buffer.hasRemaining()){
                System.out.print((char) buffer.get());
            }

            buffer.clear();
            bytes = channel.read(buffer);
        }

        file.close();
    }
}
