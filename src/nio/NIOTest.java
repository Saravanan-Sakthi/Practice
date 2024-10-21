package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class NIOTest {
    SocketChannel channel;

    {
        try {
            channel = SocketChannel.open();
            SocketAddress address = new InetSocketAddress("", 80);
            channel.connect(address);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
