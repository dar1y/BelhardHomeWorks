import java.io.FileWriter;
import java.io.IOException;

public class FileWriterPractice {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("test.txt",false)){
            //write whole string
            String txt = "Hello world my world";
            writer.write(txt);

            //write by chars
            writer.append('\n');
            writer.append('E');

            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
