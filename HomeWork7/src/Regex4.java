import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        System.out.println("Please enter your date");
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        Pattern pattern = Pattern.compile("(1\\d{3}|(200\\d|201[0-2]))\\/(0\\d|1[0-2])\\/([0-2]\\d|30)[ ](?:\\d|[01]\\d|2[0-3]):[0-5]\\d");
        Matcher matcher = pattern.matcher(date);
        if(matcher.matches()){
            System.out.println("Thank you, your date: " + date + " is valid!" );
        }else {
            System.out.println("Your date is not valid");
        }
    }
}
