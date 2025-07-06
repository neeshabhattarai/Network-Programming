import java.net.InetAddress;

public class hostandipaddress {
    public static void main(String[] args) {
        try {
            InetAddress tInet6Address = InetAddress.getLocalHost();
            System.out.println("Host address of local machine " + tInet6Address.getHostName());
            System.out.println("IP address of local machine " + tInet6Address.getHostAddress());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
