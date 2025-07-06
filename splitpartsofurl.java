import java.net.URL;

public class splitpartsofurl {
    public static void main(String[] args) {
        try {
            URL testUrl = new URL("https://www.google.com:443/abc?x=5#section1");
            System.out.println("url: " + testUrl.toString());
            System.out.println("Host Name " + testUrl.getHost());
            System.out.println("Port " + testUrl.getPort());
            System.out.println("Query String" + testUrl.getQuery());
            System.out.println("File(path+query) " + testUrl.getFile());
            System.out.println("Path " + testUrl.getPath());
            System.out.println("Fragment(Ref) " + testUrl.getRef());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
