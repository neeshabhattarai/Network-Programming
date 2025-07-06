import javax.net.ssl.*;
import java.net.Socket;

public class ClientSecureSocket {
    public static void main(String[] args) {
        try {
            Socket socket = SSLSocketFactory.getDefault().createSocket("localhost", 4000);
            System.out.println("Server connected " + socket);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
