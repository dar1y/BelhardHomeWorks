import java.io.File;

public class ClassFilePractice {
    public static void main(String[] args) {
        //object for catalog
        File dir = new File("c:\\SomeDir");
        //if its catalog
        if(dir.isDirectory()){
            //get all objects from directory
            for (File item: dir.listFiles()){
                if(item.isDirectory()){
                    System.out.println(item.getName()+ " \t folder");
                }else {
                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}
