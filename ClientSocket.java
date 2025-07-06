import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket("localhost", 4000);
            DataOutputStream writer = new DataOutputStream(socket.getOutputStream());
            System.out.println("Enter message for server");
            String line = scanner.nextLine();
            writer.writeUTF(line);
            writer.flush();
            writer.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}