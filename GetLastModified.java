import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;

public class GetLastModified {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            Date date = new Date(connection.getLastModified());
            System.out.println("Last Modified : " + date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
