import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SecureServerSocket1 {
    public static void main(String[] args) {
        try {
            // Set keystore properties
            System.setProperty("javax.net.ssl.keyStore", "serverKeyStore.jks");
            System.setProperty("javax.net.ssl.keyStorePassword", "password");

            // Create SSL server socket
            SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket serverSocket = (SSLServerSocket) ssf.createServerSocket(5000);
            System.out.println("Server is listening on port 5000...");

            // Wait for client
            SSLSocket socket = (SSLSocket) serverSocket.accept();
            System.out.println("Client connected: " + socket);

            // Perform handshake
            socket.startHandshake();

            // Read message from client
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String clientMsg = reader.readLine();
            System.out.println("Message from client: " + clientMsg);

            // Send response
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("Hello from secure server!");

            // Clean up
            writer.close();
            reader.close();
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
