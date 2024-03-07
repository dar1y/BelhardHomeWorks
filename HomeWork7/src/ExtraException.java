import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraException {
    public static void main(String[] args) throws IncorrectInfoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Full Name");
        String userFullName = sc.nextLine();
        System.out.println("Please enter the Age");
        int userAge = sc.nextInt();
        sc.nextLine();
        try {
            testException(userAge,userFullName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void testException(int age,String fullName)throws IncorrectInfoException,IOException{
        if (age < 0 || age > 100){
            throw new IncorrectInfoException(String.format("there is incorrect age : %d for the user: %s",age,fullName),new RuntimeException());
        }
        if (fullName.length()>200){
            throw new IncorrectInfoException(String.format("there is unreal big full name %s",fullName),new RuntimeException());
        }
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(fullName);
        if (matcher.find()){
            throw new IncorrectInfoException(String.format("there is unreal full name %s",fullName),new RuntimeException());
        };
    }
}
