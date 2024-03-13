import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
       String text = "Hello";
        FileOutputStream fos =null;
        try{
            fos = new FileOutputStream("file.txt");

            byte[] buffer = text.getBytes();

            fos.write(buffer,0, buffer.length);
            System.out.println("the file has been written");
        }
        catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        finally {
            if(fos !=null){
                try{
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}