import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("test.txt")){
            System.out.printf("File size: %d bytes \n", fin.available());

            byte[] buffer = new byte[fin.available()];
            fin.read(buffer);

            for(byte b : buffer){
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
