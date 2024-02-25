package equalsOpAndLogicOp;

public class DaysOfWeek2 {
    static int day = 3;
    public static void main(String[] args) {
       // checkDayIf();
        checkDaySwitch();
    }


    public static void checkDayIf(){
        if(day==1){
            System.out.println( day+ ": it's a monday");
        } else if (day==2) {
            System.out.println( day+ ": it's a tuesday");
        }else if (day==3) {
            System.out.println( day+ ": it's a wednesday");
        }
        else if (day==4) {
            System.out.println( day+ ": it's a thursday");
        }else if (day==5) {
            System.out.println( day+ ": it's a friday");
        }else if (day==6) {
            System.out.println( day+ ": it's a saturday");
        }else if (day==7) {
            System.out.println( day+ ": it's a sunday");
        }else {
            System.out.println(day+" : there are no days in the week with this number");
        }
    }


    public static void checkDaySwitch(){
     switch (day){
         default:
             System.out.println(day+" : there are no days in the week with this number");
             break;
         case 1:
             System.out.println( day+ ": it's a monday");
             break;
         case 2:
             System.out.println( day+ ": it's a tuesday");
             break;
         case 3:
             System.out.println( day+ ": it's a wednesday");
             break;
         case 4:
             System.out.println( day+ ": it's a thursday");
             break;
         case 5:
             System.out.println( day+ ": it's a friday");
             break;
         case 6:
             System.out.println( day+ ": it's a saturday");
             break;
         case 7:
             System.out.println( day+ ": it's a sunday");
             break;
     }
    }
}
