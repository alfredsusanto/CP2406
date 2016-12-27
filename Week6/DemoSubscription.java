/**
 * Created by Fred Sus on 26/12/2016.
 */
public class DemoSubscription
{
    public static void main(String[] args)
    {
        NewspaperSubscription a = new PhysicalNewspaperSubscription("Alfred","medan1");
        NewspaperSubscription b = new PhysicalNewspaperSubscription("Susanto","siantar2");
        NewspaperSubscription c = new OnlineNewspaperSubscription("Charlie","@adam");
        NewspaperSubscription d = new OnlineNewspaperSubscription("Hendry","@wahidin");
        System.out.println(a.getRate());
        System.out.println(b.getRate());
        System.out.println(c.getRate());
        System.out.println(d.getRate());
    }
}
