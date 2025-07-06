import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Nepathyacollege {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://nepathyacollege.edu.np/");
            URLConnection connection = url.openConnection();
            InputStream inputStreamReader = connection.getInputStream();
            int i;
            while ((i = inputStreamReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
