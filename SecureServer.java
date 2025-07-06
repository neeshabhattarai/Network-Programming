import javax.net.ssl.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SecureServer {
    public static void main(String[] args) throws Exception {
        ServerSocket socket = SSLServerSocketFactory.getDefault().createServerSocket(4000);
        Socket socket2 = socket.accept();
        System.out.println("Client connected" + socket2);

        ;
    }
}
