/**
 * Created by eesn on 03.05.16.
 */
public class hobbits {
    String name;

    public static void main(String[] args) {
        hobbits [] h = new hobbits[3];
        int z=0;

        while (z<4) {
            z=z+1;
            h[z]=new hobbits();
            h[z].name= "Bilbo";
            if (z==1) {
                h[z].name="Frodo";
            }
if (z==2) {
    h[z].name="Sam";
}
            System.out.print(h[z].name + " - ");
            System.out.println("Hobbits name");
        }
    }
}
