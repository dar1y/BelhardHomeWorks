package equalsOpAndLogicOp;

public class Extra7 {
    public static void main(String[] args) {
        int day = -1;
        int month = 10;
        if((day > 20 && month == 4)&&(day < 31)||(day < 22 && month == 5)&&(day > 0)){
            System.out.println("Taurus");
        } else if ((day > 21 && month == 5)&&(day < 32)||(day < 22 && month == 6)&&(day > 0)) {
            System.out.println("Gemini");
        }else if ((day > 21 && month == 6)&&(day < 31)||(day < 23 && month == 7)&&(day > 0)) {
            System.out.println("Cancer");
        }else if ((day > 22 && month == 7)&&(day < 32)||(day < 23 && month == 8)&&(day > 0)) {
            System.out.println("Leo");
        }else if ((day > 22 && month == 8)&&(day < 32)||(day < 24 && month == 9)&&(day > 0)) {
            System.out.println("Virgo");
        }else if ((day > 23 && month == 9)&&(day < 31)||(day < 24 && month == 10)&&(day > 0)) {
            System.out.println("Libra");
        }else if ((day > 23 && month == 10)&&(day < 32)||(day < 24 && month == 11)&&(day > 0)) {
            System.out.println("Scorpius");
        }else if ((day > 22 && month == 11)&&(day < 31)||(day < 22 && month == 12)&&(day > 0)) {
            System.out.println("Sagittarius");
        }else if ((day > 21 && month == 12)&&(day < 32)||(day < 21 && month == 1)&&(day > 0)) {
            System.out.println("Capricornus");
        }else if ((day > 20 && month == 1)&&(day < 32)||(day < 20 && month == 2)&&(day > 0)) {
            System.out.println("Aquarius");
        }else if ((day > 19 && month == 2)&&(day < 29)||(day < 21 && month == 3)&&(day > 0)) {
            System.out.println("Pisces");
        }else if ((day > 20 && month == 3)&&(day < 32)||(day < 21 && month == 4)&&(day > 0)) {
            System.out.println("Aries");
        }else{
            System.out.println("Incorrect input");
        }
    }
}
