import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWith {
    public static void main(String[] args) {
        String txt = "hello world";
        try(FileOutputStream fos = new FileOutputStream("file.txt")){

            byte[] buffer = txt.getBytes();

            fos.write(buffer,0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
