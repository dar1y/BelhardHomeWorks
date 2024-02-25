package equalsOpAndLogicOp;

public class Extra8 {

    public static void main(String[] args) {
        int suit = 4;
        int number = 13;

        if(number==6){
            System.out.print("six");
        } else if (number==7) {
            System.out.print("seven");
        }else if (number==8) {
            System.out.print("eight");
        }else if (number==9) {
            System.out.print("nine");
        }else if (number==10) {
            System.out.print("ten");
        }else if (number==11) {
            System.out.print("Jack");
        }else if (number==12) {
            System.out.print("Queen");
        }else if (number==13) {
            System.out.print("King");
        }else if (number==14) {
            System.out.print("Ace");
        }else{
            System.out.println("incorrect input");
        }


        switch (suit){
            case 1:
                System.out.print(" of spades");
                break;
            case 2:
                System.out.print(" of hearts");
                break;
            case 3:
                System.out.print(" of diamonds");
                break;
            case 4:
                System.out.print(" of clubs");
                break;
            default:
                System.out.println("incorrect input ");
        };
    }


    }

