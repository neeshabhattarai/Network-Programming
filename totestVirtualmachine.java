import java.net.*;

public class totestVirtualmachine {
    public static void main(String[] args) {
        testProtocol("facebook.com", 80, "HTTP");
        testProtocol("google.com", 443, "HTTPS");
        testProtocol("speedtest.tele2.net", 21, "FTP");
        testProtocol("towel.blinkenlights.nl", 23, "TELNET");
    }

    public static void testProtocol(String host, int port, String protocolName) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host, port), 3000);
            System.out.println(protocolName + " is supported");
        } catch (Exception e) {
            System.out.println(protocolName + " is not supported. ");
        }
    }
}