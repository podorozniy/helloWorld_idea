/**
 * Created by eesn on 28.04.16.
 */
public class tapedeck {
    boolean canRecord = false;

    void playTape() {
        System.out.println("play tape");
    }
    void recordTape () {
        System.out.println("tape rec");
    }
    }
class tapedeckTestdrive {
    public static void main(String[] args) {
        tapedeck t =new tapedeck();
        t.canRecord=true;
        t.playTape();

        if (t.canRecord==true) {
            t.recordTape();
        }

}
}

