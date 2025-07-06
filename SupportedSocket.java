import java.net.SocketOption;
import java.nio.channels.NetworkChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SupportedSocket {
    public static void main(String[] args) {
        try {
            PrintSocketOptions(SocketChannel.open());
            PrintSocketOptions(ServerSocketChannel.open());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void PrintSocketOptions(NetworkChannel socketChannel) {
        try {
            System.out.println("----" + socketChannel.getClass().getSimpleName() + "----");
            for (SocketOption options : socketChannel.supportedOptions()) {
                System.out.println(options);
            }
            socketChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
