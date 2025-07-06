import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EncodingandDecodingURl {
    public static void main(String[] args) {
        try {
            String encoder = URLEncoder.encode("Hello i am @nisha", "UTF-8");
            System.out.println(encoder);
            String decode = URLDecoder.decode(encoder, "UTF-8");
            System.out.println(decode);
            String host = "https://youtube.com";
            URL urlConnection = new URI(host).toURL();
            URLConnection conn = urlConnection.openConnection();
            Map<String, java.util.List<String>> test = conn.getHeaderFields();
            for (Map.Entry<String, List<String>> testrSet : test.entrySet()) {
                System.out.println(testrSet);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
