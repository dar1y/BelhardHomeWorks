package equalsOpAndLogicOp;

public class Year4 {
    static int year = 1200;

    public static void main(String[] args) {
        countDaysInYear();
    }

    static void countDaysInYear(){
        if((year%100==0 && year%400!=0)||(year%4!=0)){
            System.out.println("in this day are :365 days");
        }else{
            System.out.println("in this day are :366 days");
        }
    }
}
