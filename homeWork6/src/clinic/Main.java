package clinic;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal mouse = new Mouse();
        cat.makeNoise();
        mouse.makeNoise();
        dog.makeNoise();

    }
}
