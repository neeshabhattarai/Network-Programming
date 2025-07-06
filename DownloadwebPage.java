import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DownloadwebPage {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection urlConnection = url.openConnection();
            InputStreamReader reader = new InputStreamReader(urlConnection.getInputStream());
            BufferedReader getString = new BufferedReader(reader);
            String line;
            while ((line = getString.readLine()) != null) {
                System.out.println(line);
            }
            getString.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
