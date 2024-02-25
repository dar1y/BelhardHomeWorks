package whileForLoops;

public class WhileForLoops {
    public static void main(String[] args) {
        //1
//        int i=1;
//        while(i<5){
//            System.out.println("Task"+i);
//            i++;

        //2
//        int i = 1;
//        do {
//            if (i % 5 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        } while (i < 101);

        //3
//        int i = 6;
//        int counter = 1;
//        int result = 1;
//        for(;counter<=i;counter++){
//            result = result * counter;
//        }
//        System.out.println("factorial of : " +i + " is " + result);

        //4
//        int counter = 0;
//        int a = 5;
//        int b = 10;
//        while (b > a) {
//            --b;
//            if (b != a) {
//                System.out.println(b);
//                counter++;
//            }
//        }
//        System.out.println("there is " + counter + " numbers");

        //5
//        int a =23;
//        int b = 3;
//        while(a>b){
//            a = a-b;
//            if(a<b){
//                System.out.println(a);
//            }
//        }

        //6
//        int a = 8;
//        int b =10;
//        int c = 3;
//        System.out.println("quantity of squares in a big rectangular is: " + (a/c)*(b/c));

        //7
//       I don't know how to solve it
        int n = 936;
        int reversedInt = 0;
        while (n != 0) {
            reversedInt = reversedInt * 10 + n % 10;
            n/=10;
        }


        // how many digits in n
//        int n=9;
//        int count =1;
//            while (n>10){
//             n = n/10;
//                count++;
//        }
//        System.out.println("there is : " + count + " digits");


        //8
//        double userAcc = 1000;
//        int percentage = 5;
//        int months = 0;
//        do {
//            userAcc = userAcc + (userAcc* (0.01 * percentage));
//            months++;
//        }
//        while (userAcc < 1100);
//        System.out.println("result of growing: "+ userAcc + " passed in " + months + " months");


    }
}

