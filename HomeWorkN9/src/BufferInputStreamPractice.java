import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputStreamPractice {
    public static void main(String[] args) {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt n"))){
            System.out.printf("File size: %d bytes \n", bis.available());

            byte[] buffer = new byte[bis.available()];
            bis.read(buffer);

            for (byte b: buffer){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
