import java.net.URL;

public class DownloadObject {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://youtube.com");
            Object object = url.getContent();
            // System.out.println("Object" + object.toString());
            System.out.println("Classname :" + object.getClass().getName());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
