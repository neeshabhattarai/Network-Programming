
import java.rmi.Naming;

public class RemoteClient {
    public static void main(String[] args) {
        try {
            RemoteInterface object = (RemoteInterface) Naming.lookup("rmi://localhost:5000/Add");
            System.out.println("Addition of two number " + object.Add(4, 3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
