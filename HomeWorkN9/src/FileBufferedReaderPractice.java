import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReaderPractice {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            //read by lines
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
