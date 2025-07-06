import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class Tofhss {
    public static void main(String[] args) {
        try {
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket socket = (SSLSocket) factory.createSocket("tufohss.edu.np", 443);
            socket.startHandshake();
            String[] conneStrings = socket.getSupportedCipherSuites();
            socket.setEnabledCipherSuites(conneStrings);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("GET / HTTP/1.1");
            writer.println("Host: tufohss.edu.np");
            writer.println("Connection: close");
            writer.println("");
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            writer.close();
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
}