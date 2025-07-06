import java.beans.Encoder;
import java.net.URLEncoder;

import javax.print.DocFlavor.STRING;

public class UrlEd {
    public static void main(String[] args) {
        String string = "This is the format";
        String string2 = "Encode format@";
        try {
            String encoder = URLEncoder.encode(string, "UTF-8");
            System.out.println(encoder);
            String endString = URLEncoder.encode(string2, "UTF-8");
            System.out.println(endString);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
