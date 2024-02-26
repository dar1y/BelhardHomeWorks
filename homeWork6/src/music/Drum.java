package music;

public class Drum implements Instrument{
    int size;
    @Override
    public void play() {
        System.out.println("playing the Drums " + KEY + " with size of drums: " + size + "cm");
    }

    public Drum(int size) {
        this.size = size;
    }
}
