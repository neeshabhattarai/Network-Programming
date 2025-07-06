import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServerSocket {
    public static void main(String[] args) {
        final String group = "230.0.0.1";

        try {
            // ServerSocket socket=new ServerSocket(4000);
            // socket.accept();
            MulticastSocket socket = new MulticastSocket(4000);
            socket.joinGroup(InetAddress.getByName(group));
            byte[] message = new byte[1024];
            DatagramPacket packet = new DatagramPacket(message, message.length);
            socket.receive(packet);
            String stringMessage = new String(packet.getData(), 0, packet.getLength());

            System.out.println(stringMessage);
            socket.leaveGroup(InetAddress.getByName(group));
            socket.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
            // TODO: handle exception
        }

    }
}
