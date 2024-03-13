import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("test.txt")){

            int i;
            StringBuilder sb = new StringBuilder();
            while((i = fis.read())!=-1){
                sb.append((char) i);
            }

            System.out.println(sb.toString());
            return;
        } catch (IOException e) {
            System.out.println("there is no such file");
        }

        String txt = "hello world";

        try(FileOutputStream fos = new FileOutputStream("file.txt")){



            fos.write(txt.getBytes(),0, txt.getBytes().length);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
