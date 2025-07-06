import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class CheckPrimeNumberClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(), 5000);
            OutputStream stream = socket.getOutputStream();
            System.out.println("Enter number");

            PrintWriter writer = new PrintWriter(stream);
            String num = scanner.nextLine();
            writer.write(num);
            writer.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
