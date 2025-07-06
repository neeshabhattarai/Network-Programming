import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while (true) {
                Socket socket = serverSocket.accept();
                InputStream stream = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                String line = reader.readLine();
                Integer valuInteger = Integer.parseInt(line);

                if (valuInteger == 0) {
                    System.out.println("It is zero");

                } else {
                    Boolean valuBoolean = false;
                    for (int i = 2; i < valuInteger; i++) {
                        if (valuInteger % i == 0) {
                            valuBoolean = true;
                            break;
                        }
                        valuBoolean = false;
                    }
                    if (valuBoolean == true) {
                        System.out.println(valuInteger + "is composite number");
                    } else {
                        System.out.println(valuInteger + "is prime number");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

    }
}
