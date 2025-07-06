import java.nio.ByteBuffer;
import java.util.Arrays;

public class DataConversion {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(20);
        buffer.putInt(23);
        buffer.putFloat(23.5f);
        buffer.putChar('n');
        buffer.flip();
        int intValue = buffer.getInt();
        float float1 = buffer.getFloat();
        char charT = buffer.getChar();
        System.out.println("Integer " + intValue + "\nCharacter " + charT + "\nFloat " + float1);
    }
}
