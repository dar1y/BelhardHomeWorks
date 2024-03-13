import java.io.*;

public class HOMEWORKFolderFilesAggregator {
    public static void main(String[] args) {
        File dir = new File("c:\\SomeDir");
        for (File item : dir.listFiles()) {
            try (BufferedReader br = new BufferedReader(new FileReader(item))) {
                //read by lines
                String s;
                StringBuilder sb = new StringBuilder();
                while ((s = br.readLine()) != null) {
                    sb.append(s + " ");
                }
                String txt = sb.toString();
                try (FileWriter writer = new FileWriter("result.txt", true)) {
                    writer.write(txt);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Result.txt is ready and it contains:");
        try (BufferedReader br = new BufferedReader(new FileReader("result.txt"))) {
            //read by lines
            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
