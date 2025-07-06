import java.net.InetAddress;

public class AddressTypeChecker {
    public static void main(String[] args) {
        try {
            String address = "224.0.0.1";
            String address1 = "0.0.0.0";
            InetAddress address2 = InetAddress.getByName(address1);
            if (address2.isAnyLocalAddress()) {
                System.out.println("It is local address");
            } else if (address2.isMCGlobal()) {
                System.out.println("It is multicast address");
            } else if (address2.isMCSiteLocal()) {
                System.out.println("It is multicast site local address");
            } else if (address2.isLinkLocalAddress()) {
                System.out.println("It is link local address");
            } else if (address2.isLoopbackAddress()) {
                System.out.println("It is loopback address");
            } else if (address2.isSiteLocalAddress()) {
                System.out.println("It is site local address");
            } else if (address2.isMulticastAddress()) {
                System.out.println("It is multicast address");
            } else {
                System.out.println("------");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
