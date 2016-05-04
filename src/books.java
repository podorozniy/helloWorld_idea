/**
 * Created by eesn on 03.05.16.
 */
public class books {
    String title;
    String author;
}

class booksTestDrive {
    public static void main(String[] args) {
        books [] myBooks=new books[3];
        int x=0;

        myBooks[0] = new books();
        myBooks[1] = new books();
        myBooks[2] = new books();
        myBooks[0].title= "Java";
        myBooks[1].title= "javarush";
        myBooks[2].title= "javarecipe";
        myBooks[0].author= "bob";
        myBooks[1].author= "sue";
        myBooks[2].author= "jan";

        while (x<3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x=x+1;
        }
    }
}