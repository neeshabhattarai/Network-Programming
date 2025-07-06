import java.net.InetAddress;

public class CheckingSpam {
    public static void main(String[] args) {
        try {

            String[] testHost = new String[] {
                    "8.8.8.8",
                    "127.0.0.1",
            };
            for (String host : testHost) {
                InetAddress address = InetAddress.getByName(host);
                String hostName = address.getHostName();
                String hostAddress = address.getHostAddress();
                String conanicalName = address.getCanonicalHostName();
                System.out.println("-----------------------------");
                System.out.print(
                        "Hostname " + hostName + "\nHost Address " + hostAddress + "\nConanical Address "
                                + conanicalName + "\n");
                if (conanicalName.equals(hostAddress) || conanicalName.contains("localhost")
                        || conanicalName.contains("unknowns")) {
                    System.out.println("This might be spam " + hostName);
                }
            }
        } catch (Exception e) {

        }
    }
}
