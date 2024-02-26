package music;

public class Main {
    public static void main(String[] args) {
        Instrument[] musicBand = new Instrument[3];
        musicBand[0] = new Drum(40);
        musicBand[1] = new Guitar(12);
        musicBand[2] = new Tuba(80);
        for (Instrument i: musicBand){
            i.play();
        }
    }
}
