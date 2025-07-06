
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteObject extends UnicastRemoteObject implements RemoteInterface {
    RemoteObject() throws RemoteException {
        super();
    }

    @Override
    public int Add(int x, int y) throws RemoteException {
        return x + y;
    }
}
