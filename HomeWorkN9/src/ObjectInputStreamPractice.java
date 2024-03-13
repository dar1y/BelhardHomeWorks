import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamPractice {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objects.dat"))){
            Person p = (Person)  ois.readObject();
            System.out.printf("Name: %s\nAge: %d\nHeight: %f\nMarried: %b",p.getName(),p.getAge(),p.getHeight(), p.isMarried());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
