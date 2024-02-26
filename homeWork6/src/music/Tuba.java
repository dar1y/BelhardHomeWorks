package music;

public class Tuba implements Instrument{
    int diameter;

    @Override
    public void play() {
        System.out.println("playing the Tuba" + KEY  + " with diameter: " + diameter + "cm");
    }

    public Tuba(int diameter) {
        this.diameter = diameter;
    }
}
