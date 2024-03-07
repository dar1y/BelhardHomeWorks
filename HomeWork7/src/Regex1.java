import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        System.out.println("Please enter your page address");
        Scanner sc = new Scanner(System.in);
        String page = sc.nextLine();
        Pattern pattern = Pattern.compile("www\\.\\w+[^ ]\\.com");
        Matcher matcher = pattern.matcher(page);
        if(matcher.matches()){
            System.out.println("Thank you, your page address: " + page + " is valid!" );
        }else {
            System.out.println("Your page is not valid");
        }
    }
}
