import java.net.InetAddress;

public class ISSamper {
    public static void main(String[] args) {
        try {

            InetAddress address = InetAddress.getLocalHost();
            if (checkSpammer(address)) {
                System.out.println("Is sampper");
            } else {
                System.out.println("Isnot sampper");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static boolean checkSpammer(InetAddress address) {
        String query = "smaphaus.org/sbl";
        try {
            byte[] octet = address.getAddress();
            for (byte addresss : octet) {
                int checker = addresss < 0 ? addresss + 256 : addresss;
                query = checker + '.' + query;

            }
            InetAddress.getByName(query);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
