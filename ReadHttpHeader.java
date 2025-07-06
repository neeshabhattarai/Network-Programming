import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class ReadHttpHeader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URLConnection urlConnection = url.openConnection();
            Map<String, List<String>> header = urlConnection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : header.entrySet()) {
                for (String obString : entry.getValue()) {
                    if (entry.getKey() == null) {
                        System.out.println(obString);
                    } else {
                        System.out.println(entry.getKey() + "= " + obString);
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
