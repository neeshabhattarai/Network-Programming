import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLConnection;
import java.util.Date;

public class ServerSideDaytimeServica {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(4000);
            Socket clientSocket = socket.accept();
            System.out.println("Client connected");
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
            writer.write("Client connected at" + new Date());
            writer.close();
            clientSocket.close();
            socket.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
