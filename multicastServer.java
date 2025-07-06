import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.Socket;

public class multicastServer {
  public static void main(String[] args) {
    final String JoinGroup = "225.0.0.1";
    try {
      InetAddress inetAddress = InetAddress.getLocalHost();
      System.out.println(inetAddress.getHostAddress());
      byte[] interface1 = inetAddress.getAddress();
      NetworkInterface interface2 = NetworkInterface.getByInetAddress(inetAddress);
      if (interface2 != null) {
        byte[] address = interface2.getHardwareAddress();
        StringBuilder addressStore = new StringBuilder();
        for (int i = 0; i < address.length; i++) {
          addressStore.append(String.format("%2X%s", address[i], i < address.length - 1 ? "-" : ""));

        }
        System.out.println("Hardware Address" + addressStore);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
