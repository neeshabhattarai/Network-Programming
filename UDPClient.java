import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            String message = "Hello server";
            byte[] sendMessage = message.getBytes();
            DatagramPacket packet = new DatagramPacket(sendMessage, sendMessage.length, InetAddress.getLocalHost(),
                    4000);
            socket.send(packet);
            byte[] receivebucket = new byte[134];
            DatagramPacket packet2 = new DatagramPacket(receivebucket, receivebucket.length);
            socket.receive(packet2);
            String messages = new String(packet2.getData());
            System.out.println(messages);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
