package equalsOpAndLogicOp;

public class SumOfTwoBiggest3 {
    static int num1 = 8;
    static int num2 = 4;
   static int num3 = 5;

    public static void main(String[] args) {
        twoBiggest();
    }

  static void twoBiggest(){
        if(num1 < num2 && num1 < num3){
            System.out.println(" sum num2 and num3 is: " + (num2 + num3));
        } else if(num2 < num1 && num2 < num3){
           System.out.println(" sum num1 and num3 is: " + (num1 + num3));
        }else if(num3 < num1 && num3 < num2){
            System.out.println(" sum num1 and num2 is: " + (num2 + num1));
        }else {
            System.out.println(" some of the numbers are equal");
        }
   }

}
