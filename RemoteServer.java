import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RemoteServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(5000);
            RemoteInterface object = new RemoteObject();
            Naming.rebind("rmi://localhost:5000/Add", object);
            System.out.println("Server ready.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
