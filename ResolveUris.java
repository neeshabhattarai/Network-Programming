import java.net.URI;

public class ResolveUris {
    public static void main(String[] args) {
        try {
            URI testUri = new URI("http://example.com");
            URI example1 = testUri.create("file.txt");
            URI example2 = testUri.create("another/text1.txt");
            URI testing = testUri.resolve(example1);
            URI testing2 = testUri.resolve(example2);
            System.out.println(testing);
            System.out.println(testing2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
