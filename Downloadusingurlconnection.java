import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Downloadusingurlconnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://example.org");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}