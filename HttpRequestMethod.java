import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequestMethod {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
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
