import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPservers {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(4000);
            byte[] receivebucket = new byte[1245];
            DatagramPacket packet = new DatagramPacket(receivebucket, receivebucket.length);
            socket.receive(packet);
            InetAddress address = packet.getAddress();
            String string = new String(packet.getData());
            System.out.println(string);
            String sendMessage = "Received message " + string;
            byte[] sendMessages = sendMessage.getBytes();
            DatagramPacket packet2 = new DatagramPacket(sendMessages, sendMessages.length, address, packet.getPort());
            socket.send(packet2);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
