import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URL;

public class BlockCookie {

    public static void main(String[] args) {
        try {
            CookiePolicy policy = new CookiePolicy() {
                public boolean shouldAccept(URI uri, HttpCookie cookie) {
                    String hoString = uri.getHost();
                    return hoString != null && hoString.endsWith(".gov");
                }
            };
            CookieManager manager = new CookieManager(null, policy);
            CookieHandler.setDefault(manager);
            URL uri = new URI("http://example.gov").toURL();
            uri.openStream();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}