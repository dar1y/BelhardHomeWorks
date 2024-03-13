import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamPractice {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Objects.dat"))){
            Person p = new Person("Sam",33,178,true);
            oos.writeObject(p);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
