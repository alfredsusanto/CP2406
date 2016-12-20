/**
 * Created by jc348287 on 20/12/2016.
 */
public class UseBook
{
    public static void main(String[] args)
    {
        Book b = new Fiction("Haha");
        Book c = new NonFiction("Hello Counselor");
        System.out.println(b.getTitle());
        System.out.println(b.getPrice());
        System.out.println(c.getTitle());
        System.out.println(c.getPrice());
    }
}
