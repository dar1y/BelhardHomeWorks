package equalsOpAndLogicOp;

import java.util.Scanner;

public class EvenOddCheck1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number which you want to check for even or odd");
        int userNumber = sc.nextInt();
        if(userNumber%2==0){
            System.out.println("this is even number : " + userNumber);
        }else {
            System.out.println("this is odd number :"+ userNumber);
        }
    }
}
