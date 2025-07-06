import java.nio.ByteBuffer;
import java.util.Arrays;

public class BufferEx {
    public static void main(String[] args) {
        byte[] store = new byte[30];
        ByteBuffer byteBuffer = ByteBuffer.wrap(store);
        byte[] data = new byte[] { 13, 14, 15, 16, 17, 18 };
        byteBuffer.put(data);
        ByteBuffer duplicate = byteBuffer.duplicate();
        System.out.println("Original array " + Arrays.toString(byteBuffer.array()));
        byteBuffer.flip();
        byteBuffer.put((byte) 23);
        System.out.println("After flipping " + Arrays.toString(byteBuffer.array()));
        System.out.println("Duplicate array " + Arrays.toString(duplicate.array()));
        byteBuffer.position(2);
        ByteBuffer newBuffer = byteBuffer.slice(1, 3);
        byte[] remainingBuffer = new byte[newBuffer.remaining()];
        newBuffer.get(remainingBuffer);
        ByteBuffer compactBuffer = byteBuffer.compact();
        System.out.println("After compact " + Arrays.toString(compactBuffer.array()));
        System.out.println("After slice " + Arrays.toString(remainingBuffer));
    }
}
