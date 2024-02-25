package equalsOpAndLogicOp;

public class Extra5 {
    public static void main(String[] args) {
        int operation = 5;
        int a = 16;
        int b = 20;
        switch (operation){
            case 1:
                System.out.println("a+b result " + (a+b));
                break;
            case 2:
                System.out.println("a-b result " + (a-b));
                break;
            case 3:
                System.out.println("a*b result " + (a*b));
                break;
            case 4:
                System.out.println("a/b result " + (a/b));
                break;
            default:
                System.out.println("there is no operations under this number, please try again");
        }
    }
}
