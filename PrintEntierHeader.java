import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class PrintEntierHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URLConnection connection = url.openConnection();
            Map<String, List<String>> getH = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : getH.entrySet()) {
                System.out.println(entry);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
