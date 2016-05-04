/**
 * Created by eesn on 28.04.16.
 */
public class BeerSong {
public static void main (String[] args) {
        int BeerNum = 99;
        String word = "butilok, butilki";
        while (BeerNum > 0) {
    if (BeerNum == 1) {
                            word = "butilka";
                }
                System.out.println(BeerNum+" "+word+" beer on the wall");
        System.out.println(BeerNum+" "+word+" beer.");
        System.out.println("take one,");
        System.out.println("get around.");
        BeerNum = BeerNum-1;
        if (BeerNum>0) {
                System.out.println(BeerNum + " " + word + " beer on the wall");
        } else {
                System.out.println("there is no beer on the wall");
        }
}
}

}
