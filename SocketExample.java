import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class SocketExample {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 4000);
            System.out.println(socket.getPort());
            System.out.println("InetAddress" + socket.getInetAddress());

            System.out.println("Local Port" + socket.getLocalPort());
            System.out.println("Local Addresss" + socket.getLocalAddress());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    public void Test(Socket socket) {

    }
}