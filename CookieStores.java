import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;

public class CookieStores {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://example.com");
            CookieManager manager = new CookieManager();
            CookieStore store = manager.getCookieStore();
            HttpCookie cookie1 = new HttpCookie("fruit", "apple");
            HttpCookie cookie2 = new HttpCookie("fruits", "mango");

            store.add(uri, cookie1);
            store.add(uri, cookie2);
            List<HttpCookie> cookies = store.get(uri);
            System.out.println("Before removing Cookies" + cookies);
            store.remove(uri, cookie1);
            List<HttpCookie> cookiess = store.get(uri);
            System.out.println("After removing one cookie" + cookiess);
            List<HttpCookie> cookieresult = store.getCookies();
            System.out.println("All cookie" + cookieresult);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
