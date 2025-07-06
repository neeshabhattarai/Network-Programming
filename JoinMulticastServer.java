import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class JoinMulticastServer {
    public static void main(String[] args) {
        final String group = "230.0.0.1";
        try {
            MulticastSocket cMulticastSocket = new MulticastSocket(4000);
            cMulticastSocket.joinGroup(InetAddress.getByName(group));
            String message = "Hello server";
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(),
                    InetAddress.getByName(group), 4000);
            cMulticastSocket.send(packet);
            cMulticastSocket.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
