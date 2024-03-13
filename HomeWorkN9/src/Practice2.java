import java.io.*;

public class Practice2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            //read by lines
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }

                System.out.println(sb.toString());
                return;
        } catch (IOException e) {
            System.out.println("there is no such file");
        }
            String txt = "Hello world my world";
        try(FileWriter writer = new FileWriter("test.txt",false)){
            //write whole string

            writer.write(txt);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
