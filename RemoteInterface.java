
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteInterface extends Remote {
    int Add(int x, int y) throws RemoteException;
}