import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrintHTTpHEader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.org");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            Map<String, List<String>> map = urlConnection.getHeaderFields();
            for (Map.Entry<String, List<String>> ads : map.entrySet()) {

                for (String alist : ads.getValue()) {
                    if (ads.getKey() == null) {
                        System.out.println(ads.getValue());
                    } else {
                        System.out.println(ads.getKey() + ":" + alist);
                    }
                }
            }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
