import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Reception2 {
    public static void main(String[] args) {
        final String GROUP = "230.0.0.1";
        try {
            MulticastSocket socket = new MulticastSocket();
            String messString = "Hello i am sender2";
            InetAddress group = InetAddress.getByName(GROUP);
            socket.setLoopbackMode(false);
            socket.joinGroup(group);
            DatagramPacket packet = new DatagramPacket(messString.getBytes(), messString.length(),
                    group, 5000);
            socket.send(packet);
            System.out.println("Send message");
            socket.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
