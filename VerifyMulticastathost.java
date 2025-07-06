import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class VerifyMulticastathost {
    public static void main(String[] args) {
        final String GROUP = "230.0.0.1";
        try {
            MulticastSocket socket = new MulticastSocket(5000);
            InetAddress address = InetAddress.getByName(GROUP);
            socket.joinGroup(address);
            socket.setLoopbackMode(false);

            while (true) {
                byte[] bytes = new byte[1034];
                DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
                socket.receive(packet);
                String messString = new String(packet.getData(), 0, packet.getLength());
                System.out.println(packet.getAddress());
                System.out.println(messString);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
