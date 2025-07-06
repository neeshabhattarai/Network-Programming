import java.net.InetAddress;

public class localmachineaddress {
    public static void main(String[] args) {
        try {
            InetAddress tInet6Address = InetAddress.getLocalHost();
            System.out.println("Address of local machine " + tInet6Address);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
