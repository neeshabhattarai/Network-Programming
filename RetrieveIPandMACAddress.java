import java.net.InetAddress;
import java.net.NetworkInterface;

public class RetrieveIPandMACAddress {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("IP Address" + address.getHostAddress());
            NetworkInterface interface1 = NetworkInterface.getByInetAddress(address);
            byte[] addressCal = interface1.getHardwareAddress();
            if (addressCal.length > 0) {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < addressCal.length; i++) {
                    builder.append(String.format("%02X%s", addressCal[i], (i < addressCal.length - 1 ? "-" : "")));
                }
                System.out.println("MAC Address" + builder);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            // TODO: handle exception
        }
    }
}
