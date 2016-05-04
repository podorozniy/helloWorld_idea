/**
 * Created by eesn on 28.04.16.
 */
public class drumkit {

        boolean tophat=true;

        boolean snare=true;

        void playtophat() {
        System.out.println("din din di-din");
    }
    void playsnare() {
        System.out.println("bax bax ba-bax");
    }
    }
class DrumKitTestDrive {
    public static void main(String[] args) {
    drumkit d = new drumkit();
    d.snare=false;
    d.playsnare();
    d.playtophat();

    if (d.snare==true) {
        d.playsnare();
    }

}
}
