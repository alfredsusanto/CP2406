/**
 * Created by jc348287 on 20/12/2016.
 */
public class BookArray {
    public static void main(String[] args) {
        Book abc[] = new Book[10];
        abc[0] = new Fiction("A");
        abc[1] = new Fiction("B");
        abc[2] = new Fiction("C");
        abc[3] = new Fiction("D");
        abc[4] = new Fiction("E");
        abc[5] = new NonFiction("F");
        abc[6] = new NonFiction("G");
        abc[7] = new NonFiction("H");
        abc[8] = new NonFiction("I");
        abc[9] = new NonFiction("J");


        for (int a = 0; a < abc.length; a++) {
            System.out.println(abc[a].getTitle());
        }
    }
}
