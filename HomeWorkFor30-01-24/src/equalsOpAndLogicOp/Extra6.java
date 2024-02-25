package equalsOpAndLogicOp;

public class Extra6 {
    public static void main(String[] args) {
        int number = 3;
        if(number%2==0 && number > 99 && number <1000){
            System.out.println("it's even 3 digits number");
        }else if(number%2==1 && number > 99 && number <1000){
            System.out.println("it's odd 3 digits number");
        } else if(number%2==0 && number > 9 && number <100) {
            System.out.println("it's even 2 digits number");
        }else if(number%2 == 1 && number > 9 && number <100) {
            System.out.println("it's odd 2 digits number");
        }else if(number%2 == 0 && number > 0 && number <10) {
            System.out.println("it's even 1 digits number");
        }else if(number%2 == 1 && number > 0 && number <10) {
            System.out.println("it's odd 1 digits number");
        }else if(number == 0) {
                System.out.println("it's 1 digits number Zero");
        }else{
            System.out.println("Incorrect number");
        }
    }
}
