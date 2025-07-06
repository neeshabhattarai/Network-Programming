import java.net.InetAddress;

public class SpamCheck1 {
    public static void main(String[] args) {
        try {
            String host = "www.google.com";
            InetAddress address = InetAddress.getByName(host);
            testAddress(address);
            InetAddress address2 = InetAddress.getLocalHost();
            testAddress(address2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testAddress(InetAddress address) {
        String matchAddress = address.getHostName();
        String conanicalAddress = address.getCanonicalHostName();
        System.out.println(matchAddress + conanicalAddress);
        if (matchAddress == "unknown" || matchAddress == "localhost" || conanicalAddress.contains(matchAddress)) {
            System.out.println("Spam");
        } else {
            System.out.println("It is not spam");
        }
    }
}
