//1
public class Phone {
    String number;
    String model;
    double weight;

    //7
    public Phone() {
    }

    //5
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        //8
        Phone phone5 = new Phone("345743653","Xiaomi");
        System.out.println(phone5);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    //4
    String receiveCall(String name){
        return "Calling " + name;
    }

    //9
    public void receiveCall(String name, String number){
        System.out.println("calling " + name + " " + number);
    }
    //4
    void getNumber(){
        System.out.println("the number is: " + number);
    }

    //10
    void sendMessage(String...array){
        System.out.println(" quantity of numbers: " + array.length);
        for(String n: array){
            System.out.println(" hello friend: " + n);
        }
    }
}
