import java.net.InetAddress;

public class tocomparetwoaddress {
    public static void main(String[] args) {
        try {
            InetAddress address1 = InetAddress.getByName("www.ibiblio.org");
            InetAddress address2 = InetAddress.getByName("ibiblio.org");
            System.out.println("IP address of www.ibiblio.org: " + address1.getHostAddress());
            System.out.println("IP address of ibiblio.org: " + address2.getHostAddress());
            if (address1.equals(address2)) {
                System.out.println("Both are same");
            } else {
                System.out.println("Both are different");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
