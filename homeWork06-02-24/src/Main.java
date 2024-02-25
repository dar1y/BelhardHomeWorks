public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("348957349","Nokia",200);
        Phone phone2 = new Phone("439578345","Sony",180);
        Phone phone3 = new Phone("678678456","HTC",60);

        System.out.println("Phone1 :" + phone1.toString());
        System.out.println("Phone2 :" + phone2.toString());
        System.out.println("Phone3 :" + phone3.toString());

        System.out.println(phone1.receiveCall("Alex"));
        phone1.getNumber();
        System.out.println(phone2.receiveCall("Irina"));
        phone2.getNumber();
        System.out.println(phone3.receiveCall("Lima"));
        phone3.getNumber();


        Phone phone4 = new Phone("34534534","samsung");
        phone4.receiveCall("Veronica","3405783487");
        Phone phone6 = new Phone("34856734","Iphone",150); //8
        System.out.println(phone6);


        //10
        System.out.println("----------------");
        phone6.sendMessage(phone1.number, phone2.number);


    }
}
