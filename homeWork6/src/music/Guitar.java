package music;

public class Guitar implements Instrument{
    int stringCount;
    @Override
    public void play() {
        System.out.println("playing the guitar," + KEY + ", quantity of strings: " + stringCount + " Strings");
    }

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }
}
