import java.net.Inet6Address;
import java.net.InetAddress;

public class IPV4andIPV6 {
    public static void main(String[] args) {
        try {
            InetAddress tInet6Address = InetAddress.getLocalHost();
            byte[] check = tInet6Address.getAddress();
            if (check.length == 4) {
                System.out.println("It is ipv4 address");
            } else if (check.length == 6) {
                System.out.println("It is ipv6 address");
            } else {
                System.out.println("Unknown format");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}