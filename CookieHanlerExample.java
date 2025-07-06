import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URL;
import java.util.List;

public class CookieHanlerExample {
    public static void main(String[] args) {
        try {
            URI url = new URI("http://example.edu");
            CookiePolicy policy = new CookiePolicy() {
                @Override
                public boolean shouldAccept(URI uri, HttpCookie cookie) {
                    System.out.println(uri.getHost());
                    return uri.getHost() != null && !uri.getHost().endsWith("edu");
                }
            };
            CookieManager manager = new CookieManager();

            CookieHandler.setDefault(manager);
            manager.setCookiePolicy(policy);
            // url.openConnection().connect();
            CookieStore store = manager.getCookieStore();
            HttpCookie cookies = new HttpCookie("fruit", "apple");
            store.add(url, cookies);
            System.out.println(store.get(url));
            store.remove(url, cookies);
            System.out.println(store.getCookies());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
