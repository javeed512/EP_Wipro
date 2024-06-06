package channels;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Set;

public class SocketChannelDemo {

	public static void main(String[] args) throws IOException {
		SocketChannel server = SocketChannel.open();
		SocketAddress socketAddr = new InetSocketAddress("localhost", 3306);
		server.connect(socketAddr);

		Selector selector = Selector.open();

		server.configureBlocking(false);

		server.register(selector, SelectionKey.OP_CONNECT);

		System.out.println(selector.selectedKeys());

		Path path = Paths.get("C:/Test/input.txt");
		FileChannel fileChannel = FileChannel.open(path);
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		while (fileChannel.read(buffer) > 0) {
			buffer.flip();
			server.write(buffer);
			buffer.clear();
		}

		fileChannel.close();
		System.out.println("File Sent");
		server.close();
	}

}
